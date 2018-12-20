package src;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;


import org.junit.Test;

public class ContactsTest {

	@Test
	public void testCreateInstasce() {
		Contacts contacts = new Contacts();
		assertNotNull(contacts);
	}
	public void testDeleteContacts() {
		Contacts contacts = new Contacts();
		assertEquals(contacts.decreaseArrays(1),0);
	}

}
