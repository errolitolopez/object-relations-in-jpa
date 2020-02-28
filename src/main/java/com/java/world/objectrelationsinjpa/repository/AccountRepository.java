package com.java.world.objectrelationsinjpa.repository;

import com.java.world.objectrelationsinjpa.entity.AccountEntity;
import java.util.Optional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AccountRepository extends JpaRepository<AccountEntity, Long> {

    Optional<AccountEntity> findAccountEntityByAccountNumber(String accountNumber);
}
