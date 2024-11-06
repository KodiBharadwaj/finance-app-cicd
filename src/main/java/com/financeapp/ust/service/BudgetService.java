package com.financeapp.ust.service;

import com.financeapp.ust.dto.BudgetDto;
import com.financeapp.ust.dto.summaryDto.BudgetSummaryDto;

import java.util.List;

public interface BudgetService {

    public BudgetDto save(int id, BudgetDto budgetDto);

    public List<BudgetSummaryDto> getAllBudgets(int userId);

    public BudgetDto updateByIdAndCategory(int userId, String catergory, BudgetDto budgetDto);

    public void delete(int userId, String category);
}
