package com.garylee.springbootlabshoppingmall230h.dao.impl;

import com.garylee.springbootlabshoppingmall230h.dao.ProductDao;
import com.garylee.springbootlabshoppingmall230h.model.Product;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Product> getProducts() {
        return null;
    }
}
