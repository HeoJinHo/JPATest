package com.example.webjpaproject.demo;

import org.hibernate.Session;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Component
@Transactional
public class JpaRunner implements ApplicationRunner {

    @PersistenceContext
    EntityManager entityManager;

    @Override
    public void run(ApplicationArguments args) throws Exception{
        Account account = new Account();

        account.setUsername("jhheo");
        account.setPassword("Test1");

        Study study = new Study();
        study.setName("Spring Data JPA");


        account.addStudy(study);

//        account.getStudies().add(study);
//        study.setOwner(account);


        Session session = entityManager.unwrap(Session.class);

        session.save(account);
        session.save(study);

        Account jhheo = session.load(Account.class, account.getId());
        jhheo.setUsername("Test12");
        System.out.println("======================");
        System.out.println(jhheo.getUsername());


    }

}
