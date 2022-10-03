package com.example.fxspringappbudgetbro.Service;


import com.example.fxspringappbudgetbro.Model.Budget;
import com.example.fxspringappbudgetbro.Repo.BudgetRepo;
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



   public Optional<Budget> find(Long id)
    {
       return  serviceUtil.getBudgetRepo().findById(id);

    }

    public void delete(Budget entity) {
         serviceUtil.getBudgetRepo().delete(entity);
    }


    public void delete(Long id) {
        serviceUtil.getBudgetRepo().deleteById(id);
    }


    public Budget update(Long BudgId, Budget budgetdetails) {
        Budget budget = serviceUtil.getBudgetRepo().findById(BudgId).get();
        budget.setItem(budgetdetails.getItem());
        budget.setPrice(budgetdetails.getPrice());
        return serviceUtil.getBudgetRepo().save(budget);
    }

}
