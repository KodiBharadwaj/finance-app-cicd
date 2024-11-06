package com.financeapp.ust.repository;

import com.financeapp.ust.model.Budget;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

public interface BudgetRepository extends JpaRepository<Budget, Integer> {

    @Query("Select b From Budget b where b.user.id = :userId and b.category = :category")
    public Budget findByuserIdAndCategory(int userId, String category);

    @Modifying
    @Transactional
    @Query("Delete From Budget b where b.user.id = :userId and b.category = :category")
    public void deleteByuserIdAndCategory(int userId, String category);

}
