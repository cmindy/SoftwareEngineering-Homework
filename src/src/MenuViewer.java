import java.util.Scanner;

public class MenuViewer {

    public static Scanner scan = new Scanner(System.in);

    public static void showMenu() {
        System.out.println("==== Main Menu ====");
        System.out.println("1.Contacts");
        System.out.println("2.To-Do List");
        System.out.println("3.Appointments");
        System.out.println("4.Exit");
        System.out.print("Select: ");
    }


}
