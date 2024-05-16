package com.org.pojo;

import org.springframework.stereotype.Component;

@Component
public class Account {
    private Integer id;
    private String account;

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Account() {
    }

    public Account(Integer id, String account, Double balance) {
        this.id = id;
        this.account = account;
        this.balance = balance;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    private Double balance;
}
