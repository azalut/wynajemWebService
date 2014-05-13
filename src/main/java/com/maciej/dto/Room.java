package com.maciej.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Room implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    /**
     * size in quadrat meters
     * */
    private int size;
    private int beds;
    private boolean hasTv;
    private boolean hasWardrobe;
    private boolean hasPrivateBathroom;

    public Room(int size, int beds, boolean hasTv, boolean hasWardrobe, boolean hasPrivateBathroom) {
        this.size = size;
        this.beds = beds;
        this.hasTv = hasTv;
        this.hasWardrobe = hasWardrobe;
        this.hasPrivateBathroom = hasPrivateBathroom;
    }

    public int getId() {
        return id;
    }

    public boolean isHasTv() {
        return hasTv;
    }

    public void setHasTv(boolean hasTv) {
        this.hasTv = hasTv;
    }

    public boolean isHasWardrobe() {
        return hasWardrobe;
    }

    public void setHasWardrobe(boolean hasWardrobe) {
        this.hasWardrobe = hasWardrobe;
    }

    public boolean isHasPrivateBathroom() {
        return hasPrivateBathroom;
    }

    public void setHasPrivateBathroom(boolean hasPrivateBathroom) {
        this.hasPrivateBathroom = hasPrivateBathroom;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getBeds() {
        return beds;
    }

    public void setBeds(int beds) {
        this.beds = beds;
    }
}
