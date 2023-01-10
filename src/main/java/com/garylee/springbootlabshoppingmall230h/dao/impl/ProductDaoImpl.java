package com.garylee.springbootlabshoppingmall230h.dao.impl;

import com.garylee.springbootlabshoppingmall230h.dao.ProductDao;
import com.garylee.springbootlabshoppingmall230h.model.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductDaoImpl implements ProductDao {
    @Autowired
    private SessionFactory sessionFactory;

    public Session getSession(){
        Session session = sessionFactory.getCurrentSession();
        if(session==null){
            session=sessionFactory.openSession();
        }
        return session;
    }

    @Override
    public List<Product> getProducts() {
        return null;
    }

    @Override
    public Product getProductById(Integer productId) {

        return null;
    }

    @Override
    public Integer createProduct(Product product) {
       getSession().save(product);

        return null;
    }
}
