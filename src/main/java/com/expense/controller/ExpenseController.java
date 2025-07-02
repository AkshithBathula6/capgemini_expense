package com.copilot.expense.controller;

import com.copilot.expense.model.Expense;
import com.copilot.expense.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/api/expenses")
public class ExpenseController {
    private final ExpenseService service;

    public ExpenseController(ExpenseService service) {
        this.service = service;
    }

    @PostMapping
    public Expense create(@RequestBody Expense e) {
        return service.add(e);
    }

    @GetMapping
    public List<Expense> all() {
        return service.findAll();
    }

    @GetMapping("/summary")
    public Map<String, Double> byCategory() {
        return service.totalByCategory();
    }
}
