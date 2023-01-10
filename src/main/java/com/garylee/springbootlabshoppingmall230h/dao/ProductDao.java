package com.garylee.springbootlabshoppingmall230h.dao;

import com.garylee.springbootlabshoppingmall230h.model.Product;

import java.util.List;

public interface ProductDao {
    List<Product> getProducts();
//    List<Product> getProducts(ProductQueryParams productQueryParams);

    Product getProductById(Integer productId);

    Integer createProduct(Product product);
//    Integer createProduct(ProductRequest productRequest);

//    Integer countProduct(ProductQueryParams productQueryParams);
//    void updateProduct(Integer productId,ProductRequest productRequest);
//    void deleteProductById(Integer productId);
//    void updateStock(Integer productId,Integer stock);
}
