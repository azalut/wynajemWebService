package com.maciej.dto;

import javax.persistence.Entity;
import java.io.Serializable;

@Entity
public class Tentant implements Serializable {
    private int id;
    private String name;
    private String lastname;
    private String email;
    private String address;
    private String telnumber;
    /**
     * Number of identity card of tentant
     * */
    private String idCardNumber;
    private Rent rentId;

}
