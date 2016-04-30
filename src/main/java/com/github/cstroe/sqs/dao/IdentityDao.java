package com.github.cstroe.sqs.dao;

import com.google.common.base.Preconditions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "identity")
public class IdentityDao implements IsPersisted {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "name", nullable = false)
    private String name;

    public IdentityDao() {}

    public IdentityDao(long id, String username) {
        this.setId(id);
        this.setName(username);
    }

    @Override
    public long getId() {
        return id;
    }

    public void setId(long id) {
        Preconditions.checkArgument(id >= 0);
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        Preconditions.checkNotNull(name);
        Preconditions.checkArgument(!name.isEmpty());
        Preconditions.checkArgument(!name.contains(" "));
        Preconditions.checkArgument(!name.contains("\t"));
        Preconditions.checkArgument(!name.contains("\n"));
        this.name = name;
    }
}
