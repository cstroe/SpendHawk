package com.github.cstroe.sqs.www;

import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.action.UrlBinding;

@UrlBinding("/app/login/{$event}")
public class LoginBean extends BaseBean {
    @DefaultHandler
    public Resolution loginForm() {
        return new ForwardResolution("/login/loginForm.ftl");
    }
}
