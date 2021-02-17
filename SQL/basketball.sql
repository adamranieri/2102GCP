

-- We are tasked with making a database for a startup basketball league
-- coaches and teams and players

-- DDL (Data Definition language) CREATE or DROP or ALTER, They change the tables themselves
-- not data in the table
create table team(
	team_id int primary key generated always as identity,
	team_name varchar(100),
	hometown varchar(100),
	mascot varchar(100)
);


insert into team (team_name,hometown,mascot) values ('Grand Dunk Railroad', 'LA','Chuck the Woodchuck');
insert into team (team_name,hometown,mascot) values ('Muttonchop Mountaineers', 'Morgantown','The Ranger');
insert into team (team_name,hometown,mascot) values ('The Hawks', 'Atlanta','Hawky the Hawk');
insert into team (team_name,hometown,mascot) values ('The Heat', 'Miami','Burnie');



-- In a relational database tables contain information related to other tables
-- the tables are RELATED
-- The nature of this relationship can be in 1 of 3 different multiplicities
-- 1 to many (many to 1)
-- many to many
-- 1 to 1  (debatable if your database should really have one of these) 
-- All of these relationships are done by using foreign key
-- A foreign key is a column that references a primary key on another table
-- The foreign key goes on the child table and references the parent
-- A parent must exist before you can create the child

-- A foreign key column is NOT unqiue. BUT what it references is
-- one team will have many players. Each player only has one team

create table player(
	player_id int primary key generated always as identity,
	first_name varchar(50),
	last_name varchar(50),
	salary int,
	t_id int, --what this column represents is the team the player is on
	constraint fk_player_team foreign key (t_id) references team(team_id) -- creates a foreign key conecting the tables
)

select * from team;
select * from player;

insert into player (first_name,last_name,salary,t_id) values ('Adam','Ranieri',1000000,1);
insert into player (first_name,last_name,salary,t_id) values ('Lebron','James',1000000,4);
insert into player (first_name,last_name,salary,t_id) values ('Doctor','Jay',1000000,1);
insert into player (first_name,last_name,salary,t_id) values ('Clyde','Drexler',1000000,3);
insert into player (first_name,last_name,salary,t_id) values ('Larry','Bird',500000,3);

-- does not work violates foreign key constraint
-- there is no team with an id of 5
-- A huge reason we have foreign keys is to prevent ORPHAN records
-- orphan record is one which does not have a valid foreign key (most sql database programatically prevent this)
-- maintain referential integrity
-- prevent data from being disconnected and not relatable
insert into player (first_name,last_name,salary,t_id) values ('Chris','Bosh',500000,5);

delete from team where team_id = 2;
delete from team where team_id = 1; 
-- foreign key on another table prevents this record from being deleted
-- if it was somehow deleted you would have players who are orphans


-- What is the hometown Adam Ranieri play in? 
-- There is not one table that could answer that question

-- Many queries require us to JOIN tables together to get the information we want
-- * (all colums from both tables)
-- a join generates a new temporary for you to query
-- this table is often called a virtual table or a view (this is not a physical table saved in a database)
select * from  player inner join team on player.t_id = team.team_id;

select first_name, salary, hometown from player inner join team on player.t_id = team.team_id;

select hometown from player inner join team on player.t_id = team.team_id where last_name = 'Ranieri';


create table coach(
	coach_id int primary key generated always as identity,
	first_name varchar(50),
	last_name varchar(50),
	salary int,
	specialty varchar(50),
	t_id int,
	constraint fk_coach_team foreign key (t_id) references team(team_id)
);

insert into coach (first_name,last_name,salary,specialty,t_id) values ('Pat', 'Riley', 20000000, 'Head Coach', 4);
insert into coach (first_name,last_name,salary,specialty,t_id) values ('Phil', 'Jackson', 5000000, 'Secondary Coach', 4);
insert into coach (first_name,last_name,salary,specialty,t_id) values ('Jim', 'Harbough', 30000000, 'Athletics Trainer', 1);
insert into coach (first_name,last_name,salary,specialty,t_id) values ('Bobby', 'Knight', 8000000, 'Stess Manager', 3);



-- What is the average salary for a coach ??
-- aggregate functions must operate on many records for them to make sense
-- avg , sum , min , max 

select avg(salary) from coach;
select min(salary) from coach;
select sum(salary) from coach;

select avg(salary), t_id from coach group by t_id; -- group by is for use with agregate functions
select * from coach inner join team on team.team_id = coach.t_id;
select avg(salary), team_name from coach inner join team on team.team_id = coach.t_id  group by team_name;

-- inner join will return only records that match the on predicate
-- left join will return everything in the left table along with records on the right table
-- right join will return everything in the right table along with records on the left table
-- outer join only returns records that do not match
-- full join full outer join (returns everything) regardless of if they match or not

select * from coach;
select * from team;
select * from player;

delete from player where player_id = 2;

-- who are the coaches for each player?
-- match players to coaches where the team id is the same
select * from player inner join coach on player.t_id = coach.t_id; -- where player and coach are on the same team

select * from coach inner join player on player.t_id = coach.t_id;
-- records must match for them to be selected
select * from coach left join player on player.t_id = coach.t_id;
-- a left join will ALWAYS return every record in the left table even if ther is no match

select * from coach natural join player; -- joins two tables based on a coolumn that is named the same even if do not specify it
-- just a inner join 

-- Is there any combination of coach and player who earn more than 25,000,000?
select * from coach cross join player;



