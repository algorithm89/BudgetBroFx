package com.example.fxspringappbudgetbro.Repo;

import com.example.fxspringappbudgetbro.Model.Budget;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface BudgetRepo extends JpaRepository<Budget,Long> {






}
