package com.projectfasttrack.project22.repository;

import com.projectfasttrack.project22.model.entity.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository<Transaction, Integer> {

}
