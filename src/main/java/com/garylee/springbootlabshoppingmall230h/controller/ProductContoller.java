package com.garylee.springbootlabshoppingmall230h.controller;

import com.garylee.springbootlabshoppingmall230h.model.Product;
import com.garylee.springbootlabshoppingmall230h.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ProductContoller {
    @Autowired
    private ProductService productService;

    @GetMapping("/products")
    public ResponseEntity<List<Product>> getProducts(){
        List<Product> productList=productService.getProducts();
        return ResponseEntity.status(HttpStatus.OK).body(productList);
    }

}
