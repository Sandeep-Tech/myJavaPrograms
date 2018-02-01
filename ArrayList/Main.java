/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;

/**
 *
 * @author Sandeep Sharma
 */
public class Main {
    public static void main(String[] args){
        GroceryList myGroceryList = new GroceryList();
        
        myGroceryList.addGroceryItem("apple");
        myGroceryList.addGroceryItem("banana");
        myGroceryList.addGroceryItem("paneer");
        
        myGroceryList.printGroceryList();
        System.out.println("");
        myGroceryList.modifyGroceryList(1, "Almond");
        myGroceryList.printGroceryList();
        System.out.println("");
        myGroceryList.removeGroceryItem(0);
        myGroceryList.printGroceryList();
        
    }
}
