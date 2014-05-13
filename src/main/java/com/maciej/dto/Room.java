package com.maciej.dto;

public class Room {
    private int id;
    private int sizeQuadr;
    private int beds;

    public Room() {
    }

    public Room(int id, int sizeQuadr, int beds) {
        this.id = id;
        this.sizeQuadr = sizeQuadr;
        this.beds = beds;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSizeQuadr() {
        return sizeQuadr;
    }

    public void setSizeQuadr(int sizeQuadr) {
        this.sizeQuadr = sizeQuadr;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }
}
