package com.maciej.dao;

import java.util.List;

public interface BasicDao<T> {
    public List<T> findAll();
    public T create(T t);
    public T find(int id);
    public T update(T t);
    public void delete(int id);
}
