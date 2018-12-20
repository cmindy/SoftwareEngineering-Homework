package src;

public class ToDoItem {
    String date;
    String due;
    String description;

    public ToDoItem(String date, String due, String description) {
        this.date = date;
        this.due = due;
        this.description = description;
    }
    public void showToDoItem() {
        System.out.println("date: " + date);
        System.out.println("due: " + due);
        System.out.println("description: " + description);
    }
}

