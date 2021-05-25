package com.example.webjpaproject.demo.Model;
import com.example.webjpaproject.demo.Account;
import com.example.webjpaproject.demo.AccountImp.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Service
@RequiredArgsConstructor
@Transactional
public class AccountMV implements AccountMVIm{
    @PersistenceContext
    EntityManager entityManager;


    @Autowired
    AccountRepository accountRepository;


    public Account accountSearch(Account account)
    {

        Session session = entityManager.unwrap(Session.class);

        session.save(account);

        return account;
    }

}
