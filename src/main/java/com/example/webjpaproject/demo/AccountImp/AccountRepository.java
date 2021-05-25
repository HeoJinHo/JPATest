package com.example.webjpaproject.demo.AccountImp;

import com.example.webjpaproject.demo.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface AccountRepository extends JpaRepository<Account, Long>{

}
