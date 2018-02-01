/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;

import java.util.*;

/**
 *
 * @author Sandeep Sharma
 */
public class MobilePhone {

    private ArrayList<Contact> contacts = new ArrayList<>();
   
    // method to print all the existing contacts
    public void printContacts(){
        for (Contact contact : contacts) {
            System.out.println("Name: " + contact.getName() + "\nPhone Number: " + contact.getPhoneNumber() );
            System.out.println("");
        }
    }
    
    
    // add a contact 
    public void addContact(String name, String phoneNumber){
        boolean sameName, sameNumber;
        sameName = (searchContactByName(name) != -1); 
        sameNumber = (searchContactByPhoneNumber(phoneNumber) != -1);
              
        if( !sameName && !sameNumber){
            Contact tempContact = new Contact(name, phoneNumber);
            contacts.add(tempContact);
            System.out.println("Contact added!");
            System.out.println("");
        }
        else{
            System.out.println("Contact already exists!");
        }
    } 
    
    // remove a contact
    public void remove(String name){
        int index;
        index = searchContactByName(name);
        
        if(index != -1){
            contacts.remove(index);
            System.out.println("Contact for " + name + ", removed sucessfully!");
            System.out.println("");
        }
        else{
            System.out.println("Given contact not present");
            System.out.println("");
        }
    }
    
    // search a contact:
    
    //(by name) -> return index if given name is present, else -1.
    private int searchContactByName(String name){        
        for(int i=0;i < contacts.size();i++){
            Contact tempContact = contacts.get(i);
            if(tempContact.getName().equals(name)){
                return i;
            }
        }
        return -1;        
    }
    //(by phoneNumber) -> return index if given name is present, else -1.
    private int searchContactByPhoneNumber(String phoneNumber){        
        for(int i=0;i < contacts.size();i++){
            Contact tempContact = contacts.get(i);
            if(tempContact.getPhoneNumber().equals(phoneNumber)){
                return i;
            }
        }
        return -1;        
    }
    
    public void searchContact(String name){
        int index;
        index = searchContactByName(name);
        
        if(index != -1){
            String phoneNumber;
            phoneNumber = contacts.get(index).getPhoneNumber();
        
            System.out.println("Name: " + name + " :: Phone Number: " + phoneNumber);
        }
        else{
            System.out.println("given name");
        }
    }
    
    // modify a contact:
    public void modifyName(String currentName, String newName){
        int index = searchContactByName(currentName);
        if(index == -1){
            System.out.println("Given cantact not present!");
        }
        else{            
            boolean sameName;
            sameName = (searchContactByName(newName) != -1);
            if(sameName){
            String contactNumber = contacts.get(index).getPhoneNumber();
            System.out.println("Contact already exists with the phone number " + contactNumber); 
            }
            else{
                String phoneNumber = contacts.get(index).getPhoneNumber(); // copy old number.          
                Contact tempContact = new Contact(newName, phoneNumber); // copy new name and old number to a temporary Contact variable.
                contacts.set(index, tempContact); // set the new contact.
            }
        }
    }
    
    public void modifyNumber(String currentPhoneNumber, String newPhoneNumber){        
        int index = searchContactByPhoneNumber(currentPhoneNumber);
        
        if(index == -1){
            System.out.println("Given contact not present!");
        }
        else{
            boolean sameNumber;
            sameNumber = (searchContactByPhoneNumber(newPhoneNumber) != -1);
            if(sameNumber){
            String contactName = contacts.get(index).getName();
            System.out.println("Contact already exists under the name: " + contactName); 
            }
            else{
                String oldName = contacts.get(index).getName(); // copy old name.          
                Contact tempContact = new Contact(oldName, newPhoneNumber); // copy new phone number and old name to a temporary Contact variable.
                contacts.set(index, tempContact); // set the new contact.
            }
        }                   
    }
    
    
}






































