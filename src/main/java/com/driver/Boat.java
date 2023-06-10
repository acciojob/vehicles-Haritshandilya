package com.driver;

public abstract class Boat implements WaterVehicle{
    public void setName(String name) {
        this.name = name;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

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
