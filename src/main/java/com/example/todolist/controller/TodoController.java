package com.example.todolist.controller;

import com.example.todolist.Entity.TodoItem;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/todos")
@CrossOrigin(origins = "*")
public class TodoController {
  private List<TodoItem> todoItems = new ArrayList<>();
  private int id = 1;

  @GetMapping
  List<TodoItem> getTodoItems() {
    return todoItems;
  }

  @PostMapping
  TodoItem addTodoItem(@RequestBody TodoItem todoItem) {
    todoItem.setId(id++);
    todoItems.add(todoItem);
    return todoItem;
  }

  @PutMapping("/{id}")
  TodoItem updateTodoItem(@PathVariable int id, @RequestBody TodoItem todoItem) {
    TodoItem aItem = todoItems.stream().filter(item -> id == item.getId()).findFirst().orElse(null);
    if (aItem == null) {
      return null;
    }
    aItem.setStatus(todoItem.getStatus());
    return aItem;
  }

  @DeleteMapping("/{id}")
  TodoItem deleteTodoItem(@PathVariable int id) {
    TodoItem aItem = todoItems.stream().filter(item -> id == item.getId()).findFirst().orElse(null);
    if (aItem == null) {
      return null;
    }
    todoItems.remove(aItem);
    return aItem;
  }
}
