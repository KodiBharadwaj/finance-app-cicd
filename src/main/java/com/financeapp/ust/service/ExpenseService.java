package com.financeapp.ust.service;

import com.financeapp.ust.dto.ExpenseDto;
import com.financeapp.ust.dto.summaryDto.ExpenseSummaryDto;

import java.util.List;

public interface ExpenseService {

    public ExpenseDto save(int id, ExpenseDto expenseDto);

    public List<ExpenseSummaryDto> getAllExpenses(int userId);

    public ExpenseDto updateByIdAndCategory(int userId, String category, ExpenseDto expenseDto);

    public void delete(int userId, String category);
}
