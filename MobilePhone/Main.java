/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MobilePhone;

/**
 *
 * @author Sandeep Sharma
 */
public class Main {
    public static void main(String[] args){
       MobilePhone myPhone = new MobilePhone();
       
       // add contacts
       myPhone.addContact("mummy", "9004013038");
       myPhone.addContact("Papa", "9892020877");
       myPhone.addContact("exp1", "1234467890");
       myPhone.addContact("exp2", "09876564321");
       myPhone.addContact("MHgfv", "3684384684");

       //print all's contacts
       myPhone.printContacts();
       
       // deleting a contact
       myPhone.remove("MHgfv");
       
       // printing all contacts again
       myPhone.printContacts();
       
       //modify exp1
       myPhone.modifyName("exp1", "modifiedName1");
       myPhone.modifyNumber("09876564321", "xxxxxxxxxx");
       
       // print contacts
       myPhone.printContacts();
    }
}
