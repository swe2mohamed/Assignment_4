package org.assignment_4;

import java.time.LocalDate;

public class TodoItem {
    // Field
    private int id; // id : is an int representing each TodoItem object.
    String title; // title : representing a title like ‘Change tires.’ Not allowed to be null or empty
    String taskDescription; // description:  is used to hold further information
    boolean done; // done: represent if task is finished
    LocalDate deadLine;   // deadLine: TodoItem is overdue if current date > deadline. Not allowed to be null

    Person creator; // creator: represent who created this task.

    // Constructors


    // Methods
    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTaskDescription() {
        return taskDescription;
    }

    public void setTaskDescription(String taskDescription) {
        this.taskDescription = taskDescription;
    }

    public LocalDate getDeadLine() {
        return deadLine;
    }

    public void setDeadLine(LocalDate deadLine) {
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone(){
        // todo
        return false;
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    public boolean isOverdue(){
        // todo: should return true if current date has passed deadLine
        return false;
    }

    public String getSummary(){
        // todo: (see Person)
        return null;
    }
}
