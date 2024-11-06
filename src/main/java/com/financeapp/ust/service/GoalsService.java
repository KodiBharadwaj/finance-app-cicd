package com.financeapp.ust.service;

import com.financeapp.ust.dto.GoalsDto;
import com.financeapp.ust.dto.summaryDto.GoalsSummaryDto;

import java.util.List;

public interface GoalsService {

    public GoalsDto save(int id, GoalsDto goalsDto);

    public List<GoalsSummaryDto> getAllGoals(int userID);

    public GoalsDto updateByIdAndGoalName(int userId, String goalName, GoalsDto goalsDto);

    public void delete(int userId, String goalName);
}
