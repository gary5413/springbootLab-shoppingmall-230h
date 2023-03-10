package com.garylee.springbootlabshoppingmall230h.util;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.HibernateTransactionManager;

import javax.persistence.EntityManagerFactory;

@Configuration //配置註釋 代替xml設定
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

    @Bean
    @Autowired
    public HibernateTransactionManager transactionManager(SessionFactory sessionFactory){
        HibernateTransactionManager transactionManager = new HibernateTransactionManager();
        transactionManager.setSessionFactory(sessionFactory);
        return transactionManager;
    }

}
