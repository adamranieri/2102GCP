package dev.ranieri.lambdas;

import java.util.*;

public class BasketballPlayground {

    public static void main(String[] args) {

        Player lebron = new Player("Lebron James", 79, 20_000_000);
        Player giannas = new Player("Giannas Antesomethinggreek", 84, 15_000_000);
        Player steph = new Player("Steph Curry",76, 17_000_000);

        List<Player> players = new ArrayList<Player>();

        players.add(lebron);
        players.add(giannas);
        players.add(steph);

        // order by inserstion by default
        System.out.println(players);

        // Put these players in order in set
        // 1. order by salary

        Comparator<Player> orderBySalary = (Player player1, Player player2) ->{

            // Comparators work by comparing the two objects passed in
            // if object1 is SMALLER than object2 return -1
            // if object1 is LARGER than object2 return 1
            // if they are the same return 0
            // You as the developer define what it means to be smaller or larger
            // Player1 is SMALLER then player2 if he has a lower salary
            if(player1.salary< player2.salary){
                return -1;
            }

            if(player1.salary> player2.salary){
                return 1;
            }
            return 0;
        };

        Collections.sort(players,orderBySalary);
        System.out.println(players);

        // 2. order by height
        Comparator<Player> orderByHeight = (Player player1, Player player2) ->{

            if (player1.height< player2.height){
                return  -1;
            }

            if(player1.height>player2.height){
                return 1;
            }
            return 0;
        };
        // callback function is a lambda/function passed as an argument to another function/method
        Collections.sort(players,orderByHeight);
        // .sort(list/set,function to sort that collection by)
        System.out.println(players);

        // 3. order alphabetically

        Comparator<Player> orderAlphabetically = (Player player1, Player player2) ->{
            int diff = player1.name.compareTo(player2.name); // returns -1, 0, 1
            return  diff;
        };

        Collections.sort(players,orderAlphabetically);
        System.out.println(players);



    }
}
