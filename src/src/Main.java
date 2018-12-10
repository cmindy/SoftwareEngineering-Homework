public class Main {

    public static void main(String[] args) {

        int select;
        MenuViewer.showMenu();
        select = MenuViewer.scan.nextInt();
        MenuViewer.scan.nextLine();
        
        Contacts contacts = new Contacts();

        ToDoList toDoList = ToDoList.createManagerInstance();
        while (select != 4){
        	
	        switch (select) {
	            case 1:
	            	contacts.selectContacts();
	                break;
	            case 2:
	                break;
	            case 3:
	            	
	                break;
	        
	        }
	        MenuViewer.showMenu();
	        select = MenuViewer.scan.nextInt();
    	}
    }
}
