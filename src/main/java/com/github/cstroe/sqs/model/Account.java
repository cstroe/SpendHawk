package com.github.cstroe.sqs.model;

public interface Account extends HasIdentity {
    User getUser();
}
