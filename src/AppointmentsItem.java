package src;

class AppointmentsItem {
    String date;
    String person;
    String location;

    public AppointmentsItem(String date, String person, String location) {
        this.date = date;
        this.person = person;
        this.location = location;
    }
    
	public void showAppointmentsItem() {
        System.out.println("date: " + date);
        System.out.println("person: " + person);
        System.out.println("location: " + location);
    }
}

