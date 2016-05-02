package com.github.cstroe.sqs.dao;

import org.joda.money.Money;

import javax.persistence.*;
import java.time.LocalDateTime;

public class LineItemDao implements IsPersisted {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(targetEntity = AccountDao.class, optional = false)
    private AccountDao account;

    @Column(name = "date", nullable = false)
    private LocalDateTime date;

    @Column(name = "amount", nullable = false)
    private Money amount;

    private LineItemDao() {}

    public LineItemDao(AccountDao account, LocalDateTime date, Money amount) {
        this.account = account;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public AccountDao getAccount() {
        return account;
    }

    public void setAccount(AccountDao account) {
        this.account = account;
    }

    public LocalDateTime getDate() {
        return date;
    }

    public void setDate(LocalDateTime date) {
        this.date = date;
    }

    public Money getAmount() {
        return amount;
    }

    public void setAmount(Money amount) {
        this.amount = amount;
    }
}
