package com.maciej.dao.impl;

import com.maciej.dao.TentantDao;
import com.maciej.dto.Rent;
import com.maciej.dto.Tentant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateTentantDao implements TentantDao {
    @Autowired
    @Qualifier(value = "sessionFactory")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Tentant> findAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List list = session.createCriteria(Tentant.class).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    @Override
    public Tentant create(Tentant tentant) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(tentant);
        session.getTransaction().commit();
        session.close();
        return tentant;
    }

    @Override
    public Tentant find(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Tentant t = (Tentant) session.get(Tentant.class, id);
        session.getTransaction().commit();
        session.close();
        return t;
    }

    @Override
    public Tentant update(Tentant tentant) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(tentant);
        session.getTransaction().commit();
        session.close();
        return tentant;
    }

    @Override
    public void delete(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Tentant tentant = (Tentant) session.get(Tentant.class, id);
        session.delete(tentant);
        session.getTransaction().commit();
        session.close();
    }
}
