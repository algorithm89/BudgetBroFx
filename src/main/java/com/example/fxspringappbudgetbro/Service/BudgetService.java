package com.example.fxspringappbudgetbro.Service;


import com.example.fxspringappbudgetbro.Model.Budget;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Component
@Data
public class BudgetService {

    @Autowired
    ServiceUtil serviceUtil;

    public Budget save(Budget entity) {
        return serviceUtil.getBudgetRepo().save(entity);
    }

    public Budget update(Budget entity) {
        return serviceUtil.getBudgetRepo().save(entity);
    }


    public Optional<Budget> find(Long id) {
        return serviceUtil.getBudgetRepo().findById(id);
    }


    public void delete(Budget entity) {
         serviceUtil.getBudgetRepo().delete(entity);
    }


    public void delete(List<Budget>  budgets ) {
        serviceUtil.getBudgetRepo().deleteById(budgets);
    }
}
