package com.maciej.controllers;

import com.maciej.dao.impl.HibernateTentantDao;
import com.maciej.dto.Rent;
import com.maciej.dto.Room;
import com.maciej.dto.Tentant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Date;

@Controller
@RequestMapping("/t")
public class TentantController {
    @Autowired
    private HibernateTentantDao hibernateTentantDao;

    @RequestMapping(value = "/get/{id}")
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Tentant getTentantById(@PathVariable int id){
        return hibernateTentantDao.find(id);
    }
    @RequestMapping("/add")
    @ResponseBody
    @ResponseStatus(HttpStatus.CREATED)
    public Tentant addTentant(){
        return hibernateTentantDao.create(new Tentant("asdsa", "asd", "asd", "asd", "asd", "asd",
                new Rent(new Room(1,2,true,true,true), new Date(), new Date(), 12)));
    }

}
