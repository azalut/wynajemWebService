package com.maciej.dto;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class Tentant implements Serializable {
    @Id @GeneratedValue(strategy = GenerationType.AUTO)
    private int tentantId;
    private String name;
    private String lastname;
    private String email;
    private String address;
    private String telnumber;
    /**
     * Tentant's identity card number
     * */
    private String idCardNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rent")
    private Rent rent;

    public Tentant(){}

    public Tentant(String name, String lastname, String email, String address, String telnumber, String idCardNumber, Rent rent) {
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.address = address;
        this.telnumber = telnumber;
        this.idCardNumber = idCardNumber;
        this.rent = rent;
    }

    public int getTentantId() {
        return tentantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTelnumber() {
        return telnumber;
    }

    public void setTelnumber(String telnumber) {
        this.telnumber = telnumber;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public Rent getRent() {
        return rent;
    }

    public void setRent(Rent rent) {
        this.rent = rent;
    }
}
