public class Main {

    public static void main(String[] args) {

        int select;
        MenuViewer.showMenu();
        select = MenuViewer.scan.nextInt();
        MenuViewer.scan.nextLine();

        ToDoList toDoList = ToDoList.createManagerInstance();

        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                System.out.println("Management Program Exit...");
                break;

        }

    }
}
