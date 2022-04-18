package com.tolga.springbootmicroservice2transaction.service;

import com.tolga.springbootmicroservice2transaction.model.Transaction;

import java.util.List;

public interface ITransactionService
{

    Transaction saveTransaction(Transaction transaction);

    void deleteTransaction(Long transactionId);

    List<Transaction> findAllTransactionOfUser(Long userId);
}
