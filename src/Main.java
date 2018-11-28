public class Main {

    public static void main(String[] args) {

        int select;
        MenuViewer.showMenu();
        select = MenuViewer.scan.nextInt();
        MenuViewer.scan.nextLine();

        switch (select) {
            case 1:
                break;
            case 2:
                break;
            case 3:
            	AppointmentsItem[] appointment = new AppointmentsItem;
                break;
            case 4:
                System.out.println("Management Program Exit...");
                break;
        }

    }
}
