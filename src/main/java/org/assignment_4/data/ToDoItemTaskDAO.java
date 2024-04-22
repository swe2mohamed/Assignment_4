package org.assignment_4.data;

import org.assignment_4.model.Person;
import org.assignment_4.model.TodoItemTask;

import java.util.Collection;
import java.util.Optional;

public interface ToDoItemTaskDAO {
    TodoItemTask create(TodoItemTask todoItemTask);
    Optional<TodoItemTask> findById(int id);
    Collection<TodoItemTask> findAll();
    Collection<TodoItemTask> findByAssignedStatus(boolean status);
    Collection<TodoItemTask> findByPersonId(Person personId);
    boolean remove(int id);
}
