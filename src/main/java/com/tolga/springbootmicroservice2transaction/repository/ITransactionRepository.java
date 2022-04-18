package com.tolga.springbootmicroservice2transaction.repository;

import com.tolga.springbootmicroservice2transaction.model.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ITransactionRepository extends JpaRepository<Transaction,Long>
{
    List<Transaction> findAllByUserId(Long userId);  // Kullanıcın transactionlarını bulmak için
}
