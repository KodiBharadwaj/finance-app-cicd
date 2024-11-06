package com.financeapp.ust.service;

import com.financeapp.ust.dto.IncomeDto;
import com.financeapp.ust.dto.summaryDto.IncomeSummaryDto;

import java.util.List;

public interface IncomeService {

    public IncomeDto save(int id,IncomeDto incomeDto);

    public List<IncomeSummaryDto> getAllIncomes(int userId);

    public IncomeDto updateById(int userId, String source, IncomeDto incomeDto);

    public void deleteByIdAndSource(int userId, String source);

}
