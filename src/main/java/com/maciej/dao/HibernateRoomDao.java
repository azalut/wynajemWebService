package com.maciej.dao;

import com.maciej.dto.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateRoomDao implements RoomDao {
    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier(value = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Room createRoom(Room room) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(room);

        session.getTransaction().commit();
        session.close();
        return room;
    }

    @Override
    public Room readRoomById(int id) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        Room room = (Room) session.get(Room.class, id);

        session.getTransaction().commit();
        session.close();
        return room;
    }

    @Override
    public boolean updateRoomById(int id, Room room) {
        return false;
    }

    @Override
    public boolean deleteRoomById(int id) {
        return false;
    }

    @Override
    public List<Room> readRoomList() {
        return null;
    }
}
