package com.maciej.dao;

import com.maciej.dto.Tentant;

import java.util.List;

public interface TentantDao {
    public Tentant readTentantById(int id);
    public boolean createTentant(Tentant tentant);
    public boolean updateTentantById(int id, Tentant tentant);
    public boolean deleteTentantById(int id);
    public List<Tentant> readTentantList();
}
