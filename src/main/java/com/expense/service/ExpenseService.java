package com.copilot.expense.service;

import com.copilot.expense.model.Expense;
import com.copilot.expense.repository.ExpenseRepository;
import org.springframework.stereotype.Service;

import java.util.*;
import java.util.stream.Collectors;

@Service
public class ExpenseService {
    private final ExpenseRepository repo;

    public ExpenseService(ExpenseRepository repo) {
        this.repo = repo;
    }

    public Expense add(Expense e) {
        return repo.save(e);
    }

    public List<Expense> findAll() {
        return repo.findAll();
    }

    public Map<String, Double> totalByCategory() {
        return repo.findAll().stream()
                .collect(Collectors.groupingBy(Expense::getCategory,
                        Collectors.summingDouble(Expense::getAmount)));
    }
}
