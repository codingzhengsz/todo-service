package com.example.todolist.Entity;

public class TodoItem {
  private Integer id;
  private String content;
  private Boolean status;

  public TodoItem(Integer id, String content, Boolean status) {
    this.id = id;
    this.content = content;
    this.status = status;
  }

  public TodoItem() {
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public void setStatus(Boolean status) {
    this.status = status;
  }

  public Integer getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public Boolean getStatus() {
    return status;
  }
}
