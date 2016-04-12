<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://stripes.sourceforge.net/stripes.tld" prefix="s" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<s:layout-render
    name="/layouts/main.jsp"
    title="Edit Note"
    addNoteClass="active"
    recentNotes="${actionBean.recentNotes}">
  <s:layout-component name="pageBody">
    <div class="container">
      <s:form beanclass="com.github.cstroe.sqs.www.NoteActionBean"
              id="editNoteForm"
              class="form-horizontal">
        <div class="row">
          <div class="col-sm-8 col-sm-offset-2">
            <s:errors/>
          </div>
        </div>
        <s:hidden name="note.id"/>
        <div class="form-group">
          <div class="col-sm-8 col-sm-offset-2">
            <s:text name="note.title" class="form-control" id="title"/>
          </div>
        </div>
        <div class="form-group">
          <label for="content" class="col-sm-8 col-sm-offset-2">Note:</label>
          <s:textarea name="note.content" id="content" class="col-sm-8 col-sm-offset-2" rows="12">${actionBean.note.content}</s:textarea>
        </div>
        <div class="form-group">
          <div class="col-sm-8 col-sm-offset-2">
            <s:submit name="save" class="btn btn-primary pull-right" value="Save"/>
          </div>
        </div>
      </s:form>
    </div>
  </s:layout-component>
</s:layout-render>