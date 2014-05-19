package com.maciej.controllers;

import com.maciej.dao.impl.HibernateRentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class RentController {
    @Autowired
    private HibernateRentDao hibernateRentDao;
}