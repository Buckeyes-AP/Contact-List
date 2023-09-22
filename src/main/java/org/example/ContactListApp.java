package org.example;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class ContactListApp {
    public static void main(String[] args) {
        System.out.println("Welcome to the Contact List Application!");

        // start 'continue' loop
        String choice = "y";

        while (choice.equalsIgnoreCase(("y"))) {


            // prompt for first and last names, email, and phone
            String firstName = Console.getString("Enter first name:\t");
            String lastName = Console.getString("Enter last name:\t");
            String email = Console.getString("Enter email:\t\t");
            String phone = Console.getString("Enter phone:\t\t");
            // create instance Contact
            //Contact contact = new Contact();
            //contact.setFirstName(firstName);
            //contact.setLastName(lastName);
            //contact.setEmail(email);
            //contact.setPhone(phone);

            Contact contact = new Contact(firstName, lastName, email, phone);
            // call displayContact method
            contact.displayContact();

            // continue prompt
            choice = Console.getString("Continue? (y/n)");
        }
        System.out.println("Goodbye!");
        }
    }
