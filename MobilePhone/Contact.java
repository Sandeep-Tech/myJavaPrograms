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
public class Contact {
    // fields:
    private final String name;
    private final String phoneNumber;
    
    // constructors:
    public Contact(String name, String phoneNumber) {
        this.name = name;
        this.phoneNumber = phoneNumber;
    }

    // getters:
    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
    
            
            
}
