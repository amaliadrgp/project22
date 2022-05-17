package com.projectfasttrack.project22.controller;

import com.projectfasttrack.project22.model.entity.Transaction;
import com.projectfasttrack.project22.service.TransactionService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/transactions")
public class TransactionController {
    private final TransactionService service;

    public TransactionController(TransactionService service){
        this.service = service;
    }
    @PostMapping
    Transaction addTransaction(@RequestBody Transaction newTransaction){
        return service.create(newTransaction);
    }
    @DeleteMapping("{transactionId}")
    Transaction deleteTransaction(@PathVariable int transactionId) {
        return service.deleteTransaction(transactionId);
    }
}
