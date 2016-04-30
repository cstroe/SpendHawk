package com.github.cstroe.sqs.www;

import com.github.cstroe.sqs.dao.AccountDao;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

import java.util.ArrayList;
import java.util.List;

@UrlBinding("/app/home")
public class HomeBean extends BaseBean {
    @DefaultHandler
    public Resolution home() {
        return new ForwardResolution("/home/home.ftl");
    }

    public List<AccountDao> getAccounts() {
        List<AccountDao> daoList = new ArrayList<>();
        daoList.add(generateAccount(1));
        daoList.add(generateAccount(2));
        daoList.add(generateAccount(3));
        daoList.add(generateAccount(4));
        daoList.add(generateAccount(5));
        return daoList;
    }

    private AccountDao generateAccount(long id) {
        AccountDao dao = new AccountDao();
        dao.setId(id);
        return dao;
    }
}
