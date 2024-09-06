package com.example.expensetracker.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.expensetracker.model.Expense;
import com.example.expensetracker.repository.ExpenseRepository;

@Service
public class ExpenseService {

	@Autowired
	private ExpenseRepository expenseRepository;
	
	public List<Expense> getAllExpenses(){
		return expenseRepository.findAll();
	}
	
	public void saveExpense(Expense expense) {
		expenseRepository.save(expense);
	}
	
	public Expense getExpenseById(Long id) {
		return expenseRepository.findById(id).orElse(null);
	}
	
	public void deleteExpenseById(Long id) {
		expenseRepository.deleteById(id);
	}
	
	
}
