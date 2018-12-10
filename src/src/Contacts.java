import java.util.Scanner;

public class Contacts {
	final int MAX_CNT = 100;
	private String name;
	private String phone;
	private String email;
	private int count = 0;
	int selectmenu;
	ContactsItem[] contactsStorage = new ContactsItem[MAX_CNT];
	
	Scanner scan = new Scanner(System.in);
	
	public void selectContacts(){
		
		
		do{
			System.out.println("[1.Create Contacts 2.View Contacts 3.Update Contacts"
				+ " 4.Delete Contacts 5.Main Menu]");
			selectmenu = scan.nextInt();
		
			switch (selectmenu){
			case 1:
				Scanner stdIn = new Scanner(System.in);

				System.out.print("name:");
				name = stdIn.next();
				System.out.print("phone:");
				phone = stdIn.next();
				System.out.print("email:");
				email = stdIn.next();
				
				break;
			case 2:
				viewContacts();
				break;
			case 3:
				viewContacts();
				System.out.print("");
				break;
			case 4:
				viewContacts();
				System.out.print("");
				break;
			}
			
			
		}while (selectmenu != 5);
		

	}
	
	private void createContacts(){
		
	}
	
	private void viewContacts(){
		
	}
	
	private void updateContacts(){
		
	}
	
	private void deleteContacts(){
		
	}
}
