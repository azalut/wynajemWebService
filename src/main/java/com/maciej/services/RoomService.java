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
        roomsList.add(new Room(1, 20, 2));
        roomsList.add(new Room(2, 30, 3));
        roomsList.add(new Room(2, 25, 1));
    }

    public List<Room> getRoomsList(){
        return roomsList;
    }
}
