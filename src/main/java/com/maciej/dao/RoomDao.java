package com.maciej.dao;

import com.maciej.dto.Room;

import java.util.List;

public interface RoomDao {
    public Room createRoom(Room room);
    public Room readRoomById(int id);
    public boolean updateRoomById(int id, Room room);
    public boolean deleteRoomById(int id);
    public List<Room> readRoomList();
}
