package com.garylee.springbootlabshoppingmall230h.service.impl;

import com.garylee.springbootlabshoppingmall230h.dao.ProductDao;
import com.garylee.springbootlabshoppingmall230h.model.Product;
import com.garylee.springbootlabshoppingmall230h.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService {
    @Autowired
    private ProductDao productDao;
    @Override
    public List<Product> getProducts() {
        return productDao.getProducts();
    }
}
