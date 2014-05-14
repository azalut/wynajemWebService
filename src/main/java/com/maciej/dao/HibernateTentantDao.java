package com.maciej.dao;

import com.maciej.dto.Tentant;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class HibernateTentantDao implements TentantDao {
    private SessionFactory sessionFactory;

    @Autowired
    @Qualifier(value = "sessionFactory")
    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Tentant readTentantById(int id) {
        return null;
    }

    @Override
    public boolean createTentant(Tentant tentant) {
        Session session = sessionFactory.openSession();
        session.beginTransaction();

        session.save(tentant);

        session.getTransaction().commit();
        session.close();
        return false;
    }

    @Override
    public boolean updateTentantById(int id, Tentant tentant) {
        return false;
    }

    @Override
    public boolean deleteTentantById(int id) {
        return false;
    }

    @Override
    public List<Tentant> getTentantList() {
        return null;
    }
}
