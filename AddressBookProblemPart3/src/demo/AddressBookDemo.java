package demo;

import java.util.Scanner;

public class AddressBookDemo {

    public static void main(String[] args) {
	        AddressBook addressBook = new AddressBook();
	        Scanner scanner = new Scanner(System.in);

	        Contact newContact = new Contact("Savita", "Tekale", "123 Main St", "Cityville", "CA", "12345", "2345678908", "tekale@gmail.com");
	        addressBook.addContact(newContact);

	        Contact updatedContact = new Contact("Savi", "Chavan", "456 Oak St", "Townsville", "NY", "67890", "9876654328", "savi@gmail.com");
	        addressBook.editContact("Savita", "Tekale", updatedContact);

	        addressBook.deleteContact("Savi", "Chavan");

	     
	        System.out.println("Contacts in the Address Book:");
	        addressBook.displayContacts();

	       
	    }
	}

