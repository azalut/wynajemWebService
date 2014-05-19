package com.maciej.dao.impl;

import com.maciej.dao.RentDao;
import com.maciej.dto.Rent;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateRentDao implements RentDao {
    @Autowired
    @Qualifier(value = "sessionFactory")
    private SessionFactory sessionFactory;
    private Session session;

    @Override
    public List<Rent> findAll() {
        session = sessionFactory.openSession();
        session.beginTransaction();
        List list = session.createCriteria(Rent.class).list();
        session.getTransaction().commit();
        session.close();
        return list;
    }

    @Override
    public Rent create(Rent rent) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.persist(rent);
        session.getTransaction().commit();
        session.close();
        return rent;
    }

    @Override
    public Rent find(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Rent r = (Rent) session.get(Rent.class, id);
        session.getTransaction().commit();
        session.close();
        return r;
    }

    @Override
    public Rent update(Rent rent) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        session.update(rent);
        session.getTransaction().commit();
        session.close();
        return rent;
    }

    @Override
    public void delete(int id) {
        session = sessionFactory.openSession();
        session.beginTransaction();
        Rent r = (Rent) session.get(Rent.class, id);
        session.delete(r);
        session.getTransaction().commit();
        session.close();
    }
}
