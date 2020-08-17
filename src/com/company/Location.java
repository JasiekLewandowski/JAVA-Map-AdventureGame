package com.company;

import java.util.HashMap;
import java.util.Map;

public class Location {
    private final int locationID;
    private final String description;
    private final Map<String, Integer> exits;

    public Location( int locationID, String description) {
        this.description = description;
        this.locationID = locationID;
        this.exits = new HashMap<String, Integer>();
    }
    public void addExit (String direction, int location){
        exits.put(direction, location);
    }
    public String getDescription() {
        return description;
    }
    public int getLocationID() {
        return locationID;
    }
    public Map<String, Integer> getExits() {
        return new HashMap<String, Integer>(exits);
    }
}
