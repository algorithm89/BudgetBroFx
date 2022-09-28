package com.example.fxspringappbudgetbro.Model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name="budgetbro")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Budget {

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name = "id", updatable = false, nullable = false)
    private long id;

    public long getId() {
        return id;
    }

    private String item;


    private LocalDateTime datecreated;

    private double price;

    @Override
    public String toString() {
        return "Budget{" +
                "id=" + id +
                ", item='" + item + '\'' +
                ", datecreated=" + datecreated +
                ", price=" + price +
                '}';
    }


}
