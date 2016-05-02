package com.github.cstroe.sqs.dao;

import org.joda.money.CurrencyUnit;
import org.joda.money.Money;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;

public class AccountDao implements IsPersisted {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @ManyToOne(targetEntity = IdentityDao.class, optional = false)
    private IdentityDao identity;

    @Column(name = "name")
    private String name;

    @OneToMany(targetEntity = LineItemDao.class)
    private Collection<LineItemDao> lineitems;

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public IdentityDao getIdentity() {
        return identity;
    }

    public void setIdentity(IdentityDao identity) {
        this.identity = identity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Collection<LineItemDao> getLineItems() {
        if(lineitems == null) {
            return Collections.emptyList();
        }
        return lineitems;
    }

    public void setLineitems(Collection<LineItemDao> lineitems) {
        this.lineitems = lineitems;
    }

    public double getBalance() {
        Money sum = Money.zero(CurrencyUnit.USD);
        for(LineItemDao li : getLineItems()) {
            sum = sum.plus(li.getAmount());
        }
        return sum.getAmount().doubleValue();
    }
}
