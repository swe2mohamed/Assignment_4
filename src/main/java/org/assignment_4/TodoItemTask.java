package org.assignment_4;

public class TodoItemTask {
    // Field
    private int id; // id: is an int representing each TodoItemTask object
    private boolean assigned; // assigned: set to true if assignee is not null
    private TodoItem todoItem; // todoItem: represent the details what assignee should do before deadline. Not null
    private Person assignee;  // assignee: is the Person being assigned to do the Task.


    // Constructors

    // Methods
    public int getId() {
        return id;
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
}
