package com.github.cstroe.sqs.www;

import com.github.cstroe.sqs.dao.NoteDao;
import com.github.cstroe.sqs.dao.NotebookDao;
import com.github.cstroe.sqs.repository.RepositoryFactory;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;

import java.util.ArrayList;
import java.util.List;

class BaseBean implements ActionBean {
    private ActionBeanContext context;

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
}
