package org.assignment_4.model;

import java.time.LocalDate;

public class TodoItem {
    // Field
    private int id; // id : is an int representing each TodoItem object.
    String title; // title : representing a title like ‘Change tires.’ Not allowed to be null or empty //
    String taskDescription; // description:  is used to hold further information
    boolean done; // done: represent if task is finished
    LocalDate deadLine;   // deadLine: TodoItem is overdue if current date > deadline. Not allowed to be null //
    Person creator; // creator: represent who created this task.

    // Constructors
    public TodoItem(int id, String title, String taskDescription, boolean done, LocalDate deadLine){
        this.id = id;
        this.title = title;
        this.taskDescription = taskDescription;
        this.done = done;
        this.deadLine = deadLine;
    }

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        if (title == null || title.isEmpty()){
            throw new IllegalArgumentException("Error: The title cannot be null or empty.");
        }
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
        if (deadLine == null){
            throw new IllegalArgumentException("Error: The DeadLine cannot be null.");
        }
        this.deadLine = deadLine;
    }

    public void setDone(boolean done) {
        this.done = done;
    }

    public boolean isDone(){
        return false;
    }

    public boolean isOverdue(){
        // todo: should return true if current date has passed deadLine
        return !done && LocalDate.now().isAfter(deadLine);
    }

    public Person getCreator() {
        return creator;
    }

    public void setCreator(Person creator) {
        this.creator = creator;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        TodoItem other = (TodoItem) obj;
        return java.util.Objects.equals(id,other.id) &&
                java.util.Objects.equals(title,other.title) &&
                java.util.Objects.equals(deadLine, other.deadLine) &&
                java.util.Objects.equals(done, other.done) &&
                java.util.Objects.equals(taskDescription, other.taskDescription);
    }

    @Override
    public int hashCode() {
        // todo
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Id: " + getId() + "Title: " + getTitle() + " , DeadLine: " + getDeadLine() + " , Done: " + isDone() +", TaskDescription: " + getTaskDescription();
    }
}
