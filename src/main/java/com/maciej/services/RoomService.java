package com.maciej.services;

import com.maciej.dto.Room;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class RoomService {
    private List<Room> roomsList;

    public RoomService() {
        roomsList = new ArrayList<Room>();
    }

    public List<Room> getRoomsList(){
        return roomsList;
    }
}
