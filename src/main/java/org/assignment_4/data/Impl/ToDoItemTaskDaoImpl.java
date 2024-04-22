package org.assignment_4.data.Impl;

import org.assignment_4.data.ToDoItemTaskDAO;
import org.assignment_4.data.sequencer.ToDoItemTaskIdSequencer;
import org.assignment_4.model.Person;
import org.assignment_4.model.TodoItemTask;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

public class ToDoItemTaskDaoImpl implements ToDoItemTaskDAO {
    List<TodoItemTask> storage = new ArrayList<>();
    @Override
    public TodoItemTask create(TodoItemTask todoItemTask) {
        if (todoItemTask == null) throw new IllegalArgumentException("ToDoItemTask Data is null");
        Optional<TodoItemTask> optionalTodoItemTask  = findById(todoItemTask.getId());
        if (optionalTodoItemTask.isPresent()) throw new IllegalArgumentException("ToDoItemTask is duplicate");
        int id = ToDoItemTaskIdSequencer.nextId();
        todoItemTask.setId(id);
        storage.add(todoItemTask);
        return todoItemTask;
    }

    @Override
    public Optional<TodoItemTask> findById(int id) {
        for (TodoItemTask todoItemTask : storage){
            if (todoItemTask.getId() == id) return Optional.of(todoItemTask);
        }
        return Optional.empty();
    }

    @Override
    public Collection<TodoItemTask> findAll() {
        return new ArrayList<>(storage);
    }

    @Override
    public Collection<TodoItemTask> findByAssignedStatus(boolean status) {
        List<TodoItemTask> filterItem = new ArrayList<>();
        for (TodoItemTask todoItemTask : storage){
            if (todoItemTask.isAssigned() == status){
                filterItem.add(todoItemTask);
            }
        }
        return filterItem;
    }

    @Override
    public Collection<TodoItemTask> findByPersonId(Person personId) {
        List<TodoItemTask> filterItem = new ArrayList<>();
        for (TodoItemTask todoItemTask : storage){
            if (todoItemTask.getAssignee().getId() == personId.getId()){
                filterItem.add(todoItemTask);
            }
        }
        return filterItem;
    }

    @Override
    public boolean remove(int id) {
        Optional<TodoItemTask> optionalTodoItemTask = findById(id);
        if (!optionalTodoItemTask.isPresent()) return false;
        storage.remove(optionalTodoItemTask.get());
        return true;
    }
}
