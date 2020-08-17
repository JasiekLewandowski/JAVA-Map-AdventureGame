package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static Map<Integer, Location> locations = new HashMap<>();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        locations.put(0, new Location(0, "Jesteś w domku przed komputerkiem."));
        locations.put(1, new Location(1, "Jesteś w przedpokoju, zakładasz buty."));
        locations.put(2, new Location(2, "Jesteś na klatce. Wyszedłeś z domu."));
        locations.put(3, new Location(3, "Jesteś w windzie. Jedziesz."));
        locations.put(4, new Location(4, "Jesteś przy recepcji."));
        locations.put(5, new Location(5, "Jesteś na ulicy."));

        locations.get(1).addExit("N", 2);
        locations.get(2).addExit("W", 3);
        locations.get(3).addExit("S", 4);
        locations.get(4).addExit("E", 5);

        int loc = 1;
        while(true){
            System.out.println(locations.get(loc).getDescription());
            if (loc == 0){
                break;
            }
            Map<String, Integer> exits = locations.get(loc).getExits();
            for (String exit : exits.keySet()){
                System.out.println(exit);
            }
            String direction = scanner.nextLine().toUpperCase();
            if (exits.containsKey(direction)){
                loc = exits.get(direction);
            }
            if (!locations.containsKey(loc))
                System.out.println("There is no such location!");
        }
    }
}
