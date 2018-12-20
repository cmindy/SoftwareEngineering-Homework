
import java.util.Scanner;

public class Contacts {
	final int MAX_CNT = 100;
	private String name;
	private String phone;
	private String email;
	private int count = 1;
	int selectmenu;
	ContactsItem[] contactsStorage = new ContactsItem[MAX_CNT];
	
	Scanner scan = new Scanner(System.in);
	Scanner scannum = new Scanner(System.in);
	
	public void selectContacts(){

		do{
			System.out.println("[1.Create Contacts 2.View Contacts 3.Update Contacts"
				+ " 4.Delete Contacts 5.Main Menu]");
			selectmenu = scannum.nextInt();
		
			switch (selectmenu){
			case 1:

				System.out.println("name:");
				name = scan.nextLine();
				System.out.println("phone:");
				phone = scan.nextLine();
				System.out.println("email:");
				email = scan.nextLine();
				
				createContacts(name,phone,email);
				break;
			case 2:
				viewContacts();
				break;
			case 3:
				updateContacts();
				break;
			case 4:
				deleteContacts();
				break;
			}
			
			
		}while (selectmenu != 5);
		

	}
	
	private void createContacts(String name, String phone,String email){
		contactsStorage[count] = new ContactsItem();
		
		contactsStorage[count].name = name;
		contactsStorage[count].phone = phone;
		contactsStorage[count].email = email;
		count++;
		
	}
	
	private void viewContacts(){
		for (int i = 0; i < count; i++){
			System.out.print(i +" ");
			contactsStorage[i].showContactsItem();
		}
	}
	
	private void updateContacts(){
		int index;
		
		viewContacts();
		System.out.println("insert index to update:");
		index = scannum.nextInt();
		System.out.println("new name:");
		contactsStorage[index].name = scan.nextLine();
		System.out.println("new phone:");
		contactsStorage[index].phone = scan.nextLine();
		System.out.println("new email:");
		contactsStorage[index].email = scan.nextLine();
		
		System.out.println("Update completed");
		viewContacts();
	}
	
	private void deleteContacts(){
		int index;
		
		viewContacts();
		System.out.println("insert index to delete:");
		index = scannum.nextInt();
		decreaseArrays(index);
		System.out.println("Deletion completed");
		viewContacts();
	}
	
	public int decreaseArrays(int index) {
		for (int i = index; i < count; i++){
			contactsStorage[i] = contactsStorage[i+1];
		}
		count--;
		return count;
	}
}
