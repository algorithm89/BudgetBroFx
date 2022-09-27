package com.example.fxspringappbudgetbro.Service;


import com.example.fxspringappbudgetbro.Model.Budget;
import com.example.fxspringappbudgetbro.Repo.BudgetRepo;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@Data
public class UserService {

    @Autowired
    ServiceUtil serviceUtil;

    public Budget save(Budget entity) {
        return serviceUtil.getBudgetRepo().save(entity);
    }

    public Budget update(Budget entity) {
        return serviceUtil.getBudgetRepo().save(entity);
    }

    public void delete(Budget entity) {
         serviceUtil.getBudgetRepo().delete(entity);
    }


    public void delete(Long id) {
        serviceUtil.getBudgetRepo().deleteById(id);
    }
}
