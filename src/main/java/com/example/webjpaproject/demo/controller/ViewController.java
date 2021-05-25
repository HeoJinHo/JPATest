package com.example.webjpaproject.demo.controller;

import com.example.webjpaproject.demo.Account;
import com.example.webjpaproject.demo.Member;
import com.example.webjpaproject.demo.Model.AccountMVIm;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Controller
public class ViewController {

    private final AccountMVIm accountMVIm;

    public ViewController(AccountMVIm accountMVIm) {
        this.accountMVIm = accountMVIm;
    }
    @PersistenceContext
    EntityManager entityManager;

    @RequestMapping("/login")
    public ModelAndView login()
    {
        ModelAndView mv = new ModelAndView("login");
        System.out.println("test");

        List<Account> account = accountMVIm.accountSearch();

        mv.addObject("data", account);

        return mv;
    }

}
