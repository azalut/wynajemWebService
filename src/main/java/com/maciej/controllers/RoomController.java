package com.maciej.controllers;

import com.maciej.dto.Room;
import com.maciej.services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.Iterator;
import java.util.List;

@Controller
public class RoomController {
    @Autowired
    private RoomService roomService;

    @RequestMapping(value = "/room", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    @ResponseBody
    public Room getExRoom(){
        return new Room(1,2,true,true,true);
    }
}
