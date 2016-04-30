package com.github.cstroe.sqs.www;

import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

import java.util.ResourceBundle;

class BaseBean implements ActionBean {
    private ActionBeanContext context;
    private ResourceBundle bundle;

    @Override
    public ActionBeanContext getContext() {
        return context;
    }

    @Override
    public void setContext(ActionBeanContext context) {
        this.context = context;
    }

    public void recordError() {
        // do some sort of error logging here
        throw new RuntimeException("Error was encountered");
    }

    public String getResource(String key) {
        if(bundle == null) {
            bundle = ResourceBundle.getBundle("versions");
        }

        if(bundle.containsKey(key)) {
            return bundle.getString(key);
        } else {
            return "";
        }
    }
}
