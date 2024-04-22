package org.assignment_4.model;

public class TodoItemTask {
    // Field
    private int id; // id: is an int representing each TodoItemTask object
    private boolean assigned; // assigned: set to true if assignee is not null
    private TodoItem todoItem; // todoItem: represent the details what assignee should do before deadline. Not null//
    private Person assignee;  // assignee: is the Person being assigned to do the Task.


    // Constructors

    // Methods
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isAssigned(){
        // todo:
        return false;
    }

    public void setAssigned(boolean assigned) {
        this.assigned = assigned;
    }

    public TodoItem getTodoItem() {
        return todoItem;
    }

    public void setTodoItem(TodoItem todoItem) {
        if (todoItem == null){
            throw new IllegalArgumentException("Error: The TodoItem cannot be null.");
        }
        this.todoItem = todoItem;
    }

    public Person getAssignee() {
        return assignee;
    }

    public void setAssignee(Person assignee) {
        this.assignee = assignee;
    }

    public String getSummary(){
        // todo: (see Person) Tip: make sure boolean assigned is encapsulated
        return null;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
