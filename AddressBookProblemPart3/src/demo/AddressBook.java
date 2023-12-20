package demo;

import java.util.ArrayList;

	class AddressBook {
	    private ArrayList<Contact> contacts;

	    // Constructor
	    public AddressBook() {
	        this.contacts = new ArrayList<>();
	    }

	    public void addContact(Contact contact) {
	        contacts.add(contact);
	    }

	    public void editContact(String firstName, String lastName, Contact updatedContact) {
	        for (Contact contact : contacts) {
	            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
	                
	                contact.setAddress(updatedContact.getAddress());
	                contact.setCity(updatedContact.getCity());
	                contact.setState(updatedContact.getState());
	                contact.setZip(updatedContact.getZip());
	                contact.setPhoneNumber(updatedContact.getPhoneNumber());
	                contact.setEmail(updatedContact.getEmail());
	                System.out.println("Contact updated successfully!");
	                return;
	            }
	        }
	        System.out.println("Contact not found!");
	    }

	    public void deleteContact(String firstName, String lastName) {
	        for (Contact contact : contacts) {
	            if (contact.getFirstName().equals(firstName) && contact.getLastName().equals(lastName)) {
	                contacts.remove(contact);
	                System.out.println("Contact deleted successfully!");
	                return;
	            }
	        }
	        System.out.println("Contact not found!");
	    }

	    public void displayContacts() {
	        for (Contact contact : contacts) {
	            System.out.println(contact.getFirstName() + " " + contact.getLastName());
	        }
	    }
	}
