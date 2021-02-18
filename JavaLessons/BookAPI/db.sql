-- 1 table per entity
-- your table should have a 1-1 relationship between the columns of the table and fields of the class

create table book(	
	book_id int primary key generated always as identity,
	title varchar(200),
	author varchar(200),
	book_condition int,
	available boolean,
	return_date bigint
);

select * from book;