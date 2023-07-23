package com.book.pokebook6.models;


import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.persistence.Id;

@Entity
@Table(name = "Pokee")
public class Poke {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotNull
    @Size(min = 5,max = 200)
    private String expense;
    @NotNull
    @Size(min = 5,max = 200)
    private String vendor;
    @NotNull
    @Size(min = 5,max = 200)
    private String description;
    @NotNull
    @Min(value = 1, message = "Must be provided number")
    private int amount;


    public Poke(){}

    public Poke( String expense, String vendor, String description, int amount) {
        this.expense = expense;
        this.vendor = vendor;
        this.description = description;
        this.amount = amount;
    }

    public Long getId() {
        return id;
    }


    public String getExpense() {
        return expense;
    }

    public void setExpense(String expense) {
        this.expense = expense;
    }

    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
