package com.financeapp.ust.repository;

import com.financeapp.ust.model.Expense;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

    @Query("Select e From Expense e where e.user.id = :userId and e.category = :category")
    public Expense findByuserIdAndCategory(int userId, String category);

    @Modifying
    @Transactional
    @Query("Delete From Expense e where e.user.id = :userId and e.category = :category")
    public void deleteByIdAndCategory(int userId, String category);

}
