import java.util.Scanner;

public class Appointments {
	final int MAX_ARRAY = 100;
	AppointmentsItem[] appointments = new AppointmentsItem[MAX_ARRAY];
	int numOfArray = 0;
	int select;
	Scanner scan = new Scanner(System.in);

	public void selectAppointments() {
		while(true) {
			
	        System.out.println("===============Appointments Menu==============");
			System.out.println("1.Create");
			System.out.println("2.View");
			System.out.println("3.Update");
			System.out.println("4.Delete");
			System.out.println("5.Main Menu");	
	        System.out.println("===============================================");	
			System.out.print("selet> ");
	        select = scan.nextInt();	

			switch(select) {
				case 1:
					createAppointments();
					break;
				case 2:
					viewAppointments();
					break;
				case 3:
					updateAppointments();
					break;
				case 4: 
					deleteAppointments();
					break;
				case 5:
					MenuViewer.showMenu();
					break;
					
			}
		}	
	}
	
    public boolean checkArrayIsEmpty(int selectIndex) {
        boolean emptyFlag = false;
        int isEmpty = 0;
        
        if(numOfArray == 0) {
           System.out.println("����� ����� �����ϴ�.");
           emptyFlag = false;
        }
        else if((selectIndex > numOfArray)||(selectIndex < isEmpty)) {
           System.out.println("������ �ε����� �ش��ϴ� ����� �����ϴ�.");
           emptyFlag = false;
        }
        else {
           emptyFlag = true;
        }
        return emptyFlag;
     }
	
	public AppointmentsItem enterAppointmentsInfo() {
		System.out.print("date:");
        String date= scan.next();
        System.out.print("person:");
        String person = scan.next();
        System.out.print("location:");
        String location = scan.next();
        return new AppointmentsItem(date, person, location);
	}
	
	public void createAppointments() {
		AppointmentsItem info = enterAppointmentsInfo();
		appointments[numOfArray++] = info;
		System.out.println("��� �Է� �Ϸ�");
	}
	
	public void viewAppointments() {
        System.out.println("---------------Appointments List---------------");
        for(int idx = 0; idx < numOfArray; idx++) {
           System.out.print((idx+1)+ " )");
           System.out.println(" date: "+ appointments[idx].date +
        		   " | person: " + appointments[idx].person + 
        		   " | loccation: " + appointments[idx].location);
        }
        System.out.println("-----------------------------------------------");
	}
	
	public void updateAppointments() { 
		System.out.print("������ �ε��� �Է�> ");
		int selectIndex = scan.nextInt();
		update(selectIndex);
	}
	
    public void update(int selectIndex)
    {
       boolean emptyFlag = checkArrayIsEmpty(selectIndex);
       
       if(emptyFlag) {
           System.out.println("������ ���� �Է�>");
            System.out.print("date:");
            appointments[selectIndex-1].date = scan.next();
            System.out.print("due:");
            appointments[selectIndex-1].person = scan.next();
            System.out.print("description:");
            appointments[selectIndex-1].location = scan.next();
           System.out.println("���� �Ϸ�");
        }
    }
    
    public void deleteAppointments() {
		System.out.print("������ �ε��� �Է�> ");
		int selectIndex = scan.nextInt();
		delete(selectIndex);
    }
    
    public void delete(int selectIndex)
    {
        boolean emptyFlag = checkArrayIsEmpty(selectIndex);
        
        if(emptyFlag) {
            for(int idx=(selectIndex-1); idx < (numOfArray-1); idx++)
                appointments[idx] = appointments[idx+1];
            numOfArray--;
            System.out.println("���� �Ϸ�");
        }
    }
}
