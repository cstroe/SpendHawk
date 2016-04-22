package com.github.cstroe.sqs.www;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/app/home")
public class HomeBean extends BaseBean {
    @DefaultHandler
    public Resolution home() {
        return new ForwardResolution("/home/home.jsp");
    }
}
