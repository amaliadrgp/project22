package com.projectfasttrack.project22.service;

import com.projectfasttrack.project22.model.entity.Transaction;
import com.projectfasttrack.project22.repository.TransactionRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TransactionService {
    private final TransactionRepository repository;

    public TransactionService(TransactionRepository repository) {
        this.repository = repository;
    }

    public List<Transaction> getAll() {
        return repository.findAll();
    }

    public Transaction create(Transaction newTransaction) {
        newTransaction.setId(null);
        return  repository.save(newTransaction);
    }

    public Transaction deleteTransaction(int transactionId) {
        Optional<Transaction> transaction = repository.findById(transactionId);
        transaction.ifPresent(repository::delete);
        return transaction.orElse(null);
    }
}
