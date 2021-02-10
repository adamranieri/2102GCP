package dev.ranieri.collectionsfun;

import java.util.*;

public class CollectionPlayground {

    public static void main(String[] args) {

        Player hakeem = new Player("Hakeem Olajowoun", 84);
        Player steph = new Player("Stephen Curry",76);
        Player kyrie = new Player("Kyrie Irving",75);
        Player jordan = new Player("Michael Jordan",78);

        // List is an interface. ArrayList is an implementing class
        // <> generic argument
        // Allows us to specify what belongs in this list
        // this list can ONLY hold play objects. You should ALWAYS use generics
        // stores in order of insertion
        // can have duplicates
        List<Player> playerList = new ArrayList<Player>();
        playerList.add(hakeem);
        playerList.add(steph);
        playerList.add(kyrie);
        playerList.add(steph);
        playerList.add(jordan);
        playerList.add(steph);
        System.out.println(playerList);

        // for each aka Enhanced for loop makes a for loop that will iterate over every player
        for(Player p : playerList){
            System.out.println(p.name);
        }
        // Advantages over arrays
        // dynamically size. When you create an array like int [] ray = new int [10];
        // Lists have a bunch of helpful methods attached to them
        int [] ray = new int[7];
        // System.out.println(playerList.contains(steph));

        // No duplicates
        // Does not maintain the order of insertion
        Set<Player> playerSet = new HashSet<Player>();
        playerSet.add(hakeem);
        playerSet.add(steph);
        playerSet.add(kyrie);
        playerSet.add(steph);
        playerSet.add(jordan);
        playerSet.add(steph);
        System.out.println(playerSet);

        for (Player p : playerSet ){
            System.out.println(p.height);
        }

        // maps stores objects as key value pairs
        //<Key, Value> a dictionary
        Map<String,Player> playerMap = new HashMap<String,Player>();
        playerMap.put("Steph", steph);
        playerMap.put("air jordan", jordan);
        playerMap.put("The Dream", hakeem);

        Player a = playerMap.get("air jordan");
        System.out.println(a);

        // you cannot Iterate over maps. That is a no go
        // you can get the values then iterate though
        for( Player p : playerMap.values()){
            // if you are having to iterate over map values
            // you probably do not want a map
        }

        // Collections class is a utility class filled with static methods
        // helper functions
        System.out.println(Collections.frequency(playerList,steph));


    }


}
