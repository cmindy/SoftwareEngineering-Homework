package src;

public class ToDoList {

    final int MAX_CNT=100;
    static ToDoList instance=null;
    int count = 0;

    ToDoItem[] toDoStorage=new ToDoItem[MAX_CNT];

    public static ToDoList createManagerInstance() {

        return instance;
    }

    public void selectToDoList() {
        while (true) {
            System.out.println("1.Create,2.View,3.Update,4.Delete");
            System.out.print("ют╥б>>");
            int select = MenuViewer.scan.nextInt();
            MenuViewer.scan.nextLine();
            switch (select) {

            }
        }
    }

}
