package com.github.cstroe.sqs.dao;

import com.google.common.base.Preconditions;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "note")
public class NoteDao {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name = "id")
    private long id;

    @Column(name = "created", nullable = false)
    private LocalDateTime created;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "content")
    private String content;

    @ManyToOne(targetEntity = NotebookDao.class, optional = false)
    private NotebookDao notebook;

    public NoteDao() {}

    public NoteDao(long id, LocalDateTime created, String title, String content, NotebookDao notebook) {
        setId(id);
        setCreated(created);
        setTitle(title);
        setContent(content);
        setNotebook(notebook);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        Preconditions.checkArgument(id >= 0);
        this.id = id;
    }

    public LocalDateTime getCreated() {
        return created;
    }

    public void setCreated(LocalDateTime created) {
        Preconditions.checkNotNull(created);
        this.created = created;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        Preconditions.checkNotNull(title);
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public NotebookDao getNotebook() {
        return notebook;
    }

    public void setNotebook(NotebookDao notebook) {
        Preconditions.checkNotNull(notebook);
        this.notebook = notebook;
    }
}
