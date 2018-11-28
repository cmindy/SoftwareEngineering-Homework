
public class Contacts {
	private String name;
	private String phone;
	private String email;
	ContactsItem[] contactsStorage;
	
	public void selectContacts(int select){
		switch (select){
		case 1:
			System.out.print("Contacts 정보 입력:");
			break;
		case 2:
			viewContacts();
			break;
		case 3:
			viewContacts();
			System.out.print("수정할 인덱스 입력:");
			break;
		case 4:
			viewContacts();
			System.out.print("삭제할 인덱스 입력:");
			break;
		}
	
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
