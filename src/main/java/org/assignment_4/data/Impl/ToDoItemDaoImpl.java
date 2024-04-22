package org.assignment_4.data.Impl;

import org.assignment_4.data.ToDoItemDAO;
import org.assignment_4.data.sequencer.ToDoItemIdSequencer;
import org.assignment_4.model.Person;
import org.assignment_4.model.TodoItem;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ToDoItemDaoImpl implements ToDoItemDAO {
    List<TodoItem> storage = new ArrayList<>();

    @Override
    public TodoItem create(TodoItem todoItem) {
        if (todoItem == null) throw new IllegalArgumentException("ToDoItem Data is null");
        Optional<TodoItem> optionalTodoItem = findById(todoItem.getId());
        if (optionalTodoItem.isPresent()) throw new IllegalArgumentException("ToDoItem is duplicate.");
        int id = ToDoItemIdSequencer.nextId();
        todoItem.setId(id);
        storage.add(todoItem);
        return todoItem;
    }

    @Override
    public Optional<TodoItem> findById(int id) {
        for (TodoItem todoItem : storage){
            if (todoItem.getId() == id) return Optional.of(todoItem);
        }
        return Optional.empty();
    }

    @Override
    public Collection<TodoItem> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public Collection<TodoItem> findAllByDoneStatus(boolean done) {
        List<TodoItem> filterItem = new ArrayList<>();
        for (TodoItem todoItem : storage){
            if (todoItem.isDone() == done) {
                filterItem.add(todoItem);
            }
        }
        return filterItem;
    }

    @Override
    public Collection<TodoItem> findByTitleContains(String title) {
        List<TodoItem> filterItem = new ArrayList<>();
        for (TodoItem todoItem : storage){
            if (todoItem.getTitle().equals(title)){
                filterItem.add(todoItem);
            }
        }
        return filterItem;
    }

    @Override
    public Collection<TodoItem> findByPersonId(Person creator) {
        List<TodoItem> filterItem = new ArrayList<>();
        for (TodoItem todoItem : storage){
            if (todoItem.getCreator().equals(creator)){
                filterItem.add(todoItem);
            }
        }
        return filterItem;
    }

    @Override
    public Collection<TodoItem> findByDeadlineBefore(LocalDate beforeDeadLine) {
        List<TodoItem> filterItem = new ArrayList<>();
        for (TodoItem todoItem : storage){
            if (todoItem.getDeadLine().equals(beforeDeadLine)){
                filterItem.add(todoItem);
            }
        }
        return filterItem;
    }

    @Override
    public Collection<TodoItem> findByDeadlineAfter(LocalDate afterDeadline) {
        List<TodoItem> filterItem = new ArrayList<>();
        for (TodoItem todoItem : storage){
            if (todoItem.getDeadLine().isAfter(afterDeadline)){
                filterItem.add(todoItem);
            }
        }
        return filterItem;
    }

    @Override
    public boolean remove(int id) {
        Optional<TodoItem> optionalTodoItem = findById(id);
        if (!optionalTodoItem.isPresent()) return false;
        storage.remove(optionalTodoItem.get());
        return true;
    }
}
