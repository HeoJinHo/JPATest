package com.example.webjpaproject.demo.Model;
import com.example.webjpaproject.demo.Account;
import com.example.webjpaproject.demo.AccountImp.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
@RequiredArgsConstructor
public class AccountMV implements AccountMVIm{


    @Autowired
    AccountRepository accountRepository;


    @Override
    public List<Account> accountSearch()
    {
        List<Account> accountList = accountRepository.findAll();

        return accountList;
    }

}
