package org.assignment_4.data;

import org.assignment_4.model.Person;
import org.assignment_4.model.TodoItem;

import java.time.LocalDate;
import java.util.Collection;
import java.util.Optional;

public interface ToDoItemDAO {
    TodoItem create(TodoItem todoItem);
    Optional<TodoItem> findById(int id);
    Collection<TodoItem> findAll();
    Collection<TodoItem> findAllByDoneStatus(boolean done);
    Collection<TodoItem> findByTitleContains(String title);
    Collection<TodoItem> findByPersonId(Person creator);
    Collection<TodoItem> findByDeadlineBefore(LocalDate beforeDeadLine);
    Collection<TodoItem> findByDeadlineAfter(LocalDate afterDeadline);
    boolean remove(int id);
}
