package com.maciej.services;

import com.maciej.dao.HibernateRoomDao;
import com.maciej.dto.Room;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    @Autowired
    private HibernateRoomDao hibernateRoomDao;

    public RoomService() {}

    public Room getExRoom(){
        return hibernateRoomDao.createRoom(new Room(10, 2, true, true ,true));
    }


}
