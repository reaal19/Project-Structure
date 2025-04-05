/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package javaapplication45;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication45 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> firstNames = new ArrayList<>();
        ArrayList<String> lastNames = new ArrayList<>();
        ArrayList<String> emails = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

        // populate the lists with some sample data
        firstNames.add("John");
        lastNames.add("Doe");
        emails.add("john.doe@example.com");
        phoneNumbers.add("555-1234");
        
          firstNames.add("rana");
        lastNames.add("ali");
        emails.add("rana@gmail.com");
        phoneNumbers.add("204561463");

        System.out.println("Enter the new contact data:");
        System.out.print("First name: ");
        String firstName = scanner.nextLine();
        System.out.print("Last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Email address: ");
        String email = scanner.nextLine();
        System.out.print("Phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter the last name for the customer after which you want to add the new contact:");
        String lastNameToInsertAfter = scanner.nextLine();

        int indexToInsertAfter = -1; 
        
        
        for (int i = 0; i < lastNames.size(); i++) {    
            
            if (lastNames.get(i).equals(lastNameToInsertAfter))  ////    law al last name ba -1 yani ma4 maktob fiha 7aga sa3atha hayatba3 al i alii haya ba zero ya3nii mafi4 7aga hatataba3
            { 
                indexToInsertAfter = i;
                break;
            }
        }

        if (indexToInsertAfter == -1) {                                                    // law al user daa5al kol al data masbota ma3ada al email hayatla3 not match lakan law da5al kol al data sa7 yatala3 updatedd
            
            
            System.out.println("No matching customer found. The new contact will be added to the end of the list.");
            firstNames.add(firstName);
            lastNames.add(lastName);
            emails.add(email);
            phoneNumbers.add(phoneNumber);
        } else {
            System.out.println("Inserting the new contact after " + lastNames.get(indexToInsertAfter) + ".");
            firstNames.add(indexToInsertAfter + 1, firstName);
            lastNames.add(indexToInsertAfter + 1, lastName);
            emails.add(indexToInsertAfter + 1, email);
            phoneNumbers.add(indexToInsertAfter + 1, phoneNumber);
        }

        // print the updated contact list
        System.out.println("Updated contact list:");
        for (int i = 0; i < firstNames.size(); i++) {
            System.out.println(lastNames.get(i) + ", " + firstNames.get(i) + ": " + emails.get(i) + ", " + phoneNumbers.get(i));
        
    }
    
}
}