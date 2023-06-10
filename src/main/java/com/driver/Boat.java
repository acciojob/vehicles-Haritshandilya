package com.driver;

public abstract class Boat implements WaterVehicle{
    private String name;
    private int capacity;

    public int getCapacity(){
        return capacity;
    }

    public String getName(){
        return name;
    }

    public Boat(String name,  int capacity){
        this.name = name;
        this.capacity = capacity;
    }

}
