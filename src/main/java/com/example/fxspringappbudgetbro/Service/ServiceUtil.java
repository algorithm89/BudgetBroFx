package com.example.fxspringappbudgetbro.Service;

import com.example.fxspringappbudgetbro.Repo.BudgetRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Data
public class ServiceUtil {
    @Autowired
    BudgetRepo budgetRepo;
}
