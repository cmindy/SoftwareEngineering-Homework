package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

class AppointmentsTest {
	Appointments appointment =  new Appointments();
	AppointmentsItem appointments = new AppointmentsItem("2018/10/12", "¾çÀ¯Á¤", null);
	int selectIndex;
	boolean flag;
	
	@Test
	void testisArrayEmpty(){
		selectIndex=4;
		flag= appointment.checkArrayIsEmpty(selectIndex);
        assertFalse(appointment.checkArrayIsEmpty(selectIndex));
	}

	
	@Test
	void testisArrayNull() {
		selectIndex=1;
		flag= appointment.isNullArray(appointments);
        assertFalse(appointment.isNullArray(appointments));
	}
}
