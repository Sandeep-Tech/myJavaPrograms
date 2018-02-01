/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArrayList;
import java.util.*;
/**
 *
 * @author Sandeep Sharma
 */
public class GroceryList {
    // declare list
    private ArrayList<String> groceryList = new ArrayList<String>();    

    // add grocery item method
    public void addGroceryItem(String item){
        groceryList.add(item);
        System.out.println(item + " added to the grocery list.\r");
    }
    
    // print grocery item method
    public void printGroceryList(){
        System.out.println("you have " + groceryList.size() + " items in your Grocery List.");
        for(int i=0; i<groceryList.size(); i++){
            System.out.println((i+1)+ ". " + groceryList.get(i));
        }
    
    }
    
    // modify grocery item method
    public void modifyGroceryList(int position, String newItem){
        groceryList.set(position,newItem);
        System.out.println("Grocery item " + (position+1) + " has been modified.");
    }
    
    // remove grocery item method
    public void removeGroceryItem(int position){
        groceryList.remove(position);
    }
}
