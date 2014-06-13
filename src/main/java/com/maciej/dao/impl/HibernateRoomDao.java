package com.maciej.dao.impl;

import com.maciej.dao.RoomDao;
import com.maciej.dto.Room;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateRoomDao implements RoomDao {

    @Autowired
    @Qualifier(value = "sessionFactory")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Room> findAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List list = session.createCriteria(Room.class).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    @Override
    public Room create(Room room) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.save(room);
        session.getTransaction().commit();
        session.close();
        return room;
    }

    @Override
    public Room find(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Room r = (Room) session.get(Room.class, id);
        session.getTransaction().commit();
        session.close();
        return r;
    }

    @Override
    public Room update(Room room) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(room);
        session.getTransaction().commit();
        session.close();
        return room;
    }

    @Override
    public void delete(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Room room = (Room) session.get(Room.class, id);
        session.delete(room);
        session.getTransaction().commit();
        session.close();
    }
}
