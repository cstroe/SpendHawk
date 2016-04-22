package com.github.cstroe.sqs.dao;

import com.github.cstroe.sqs.model.User;
import com.google.common.base.Preconditions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class UserDao implements User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "login", nullable = false)
    private String login;

    public UserDao() {}

    public UserDao(long id, String login) {
        this.setId(id);
        this.setLogin(login);
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        Preconditions.checkArgument(id >= 0);
        this.id = id;
    }

    @Override
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        Preconditions.checkNotNull(login);
        Preconditions.checkArgument(!login.isEmpty());
        Preconditions.checkArgument(!login.contains(" "));
        Preconditions.checkArgument(!login.contains("\t"));
        Preconditions.checkArgument(!login.contains("\n"));
        this.login = login;
    }
}
