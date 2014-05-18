package com.maciej.controllers;

import com.maciej.dao.impl.HibernateRoomDao;
import com.maciej.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class RoomController {
    @Autowired
    private HibernateRoomDao hibernateRoomDao;

    @RequestMapping(value = "/list", method = RequestMethod.GET)
    @ResponseBody
    public List<Room> lista(){
        return hibernateRoomDao.findAll();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    @ResponseBody
    public Room dodaj(@RequestBody Room room){
        return hibernateRoomDao.create(room);
    }

    @RequestMapping(value = "/find/{roomId}", method = RequestMethod.GET)
    @ResponseBody
    public Room znajdz(@PathVariable int roomId){
        return hibernateRoomDao.find(roomId);
    }

    @RequestMapping(value = "/update", method = RequestMethod.PUT)
    @ResponseBody
    public Room edytuj(@RequestBody Room room){
        return hibernateRoomDao.update(room);
    }

    @RequestMapping(value = "/delete/{roomId}", method = RequestMethod.DELETE)
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void usun(@PathVariable int roomId){
        hibernateRoomDao.delete(roomId);
    }

    @RequestMapping("/roll")
    @ResponseBody
    public Room roll(){
        return hibernateRoomDao.create(new Room(1,1,true,true,false));
    }
}
