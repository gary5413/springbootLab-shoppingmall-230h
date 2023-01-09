package com.garylee.springbootlabshoppingmall230h.model;

import com.garylee.springbootlabshoppingmall230h.constant.ProductCategory;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@Table(name = "product")
public class Product {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private Integer productId;
    @Column(name = "product_name")
    private String productName;
    @Column(name = "category")
    @Enumerated(EnumType.STRING)
    private ProductCategory productCategory;
    @Column(name = "image_url")
    private String imageUrl;
    @Column(name = "price")
    private Integer price;
    @Column(name = "stock")
    private Integer stock;
    @Column(name = "description")
    private String description;
    @Column(name = "created_date")
    private Date createdDate;
    @Column(name = "last_modified_date")
    private Date lastModifiedDate;
}
