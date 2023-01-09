package com.garylee.springbootlabshoppingmall230h.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.persistence.EntityManagerFactory;

@Configuration
public class HibernateUtilConfig {
    @Autowired
    private EntityManagerFactory entityManagerFactory;

    @Bean
    public SessionFactory getSessionFactory(){
        if(entityManagerFactory.unwrap(SessionFactory.class)==null){
            throw new NullPointerException("factory is not hibernate factory");
        }
        return entityManagerFactory.unwrap(SessionFactory.class);
    }
}