/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankProblem.Problem2;
import java.util.*;
/**
 *
 * @author Sandeep Sharma
 */
public class Solution {
    
    private static ArrayList<ArrayList<Integer>> mainSequence; // main ArrayList
    
    private static int nSequences, nQueries; // number of sequences and queries respectively
    private static int lastAnswer = 0;
    
    static Scanner scan = new Scanner(System.in);
    
    public static void main(String[] args) {
        getInputAndAnswerQuery();
 
    }
    
    private static void getInputAndAnswerQuery(){
        nSequences = scan.nextInt();
        nQueries = scan.nextInt();
        initializeArryList();
        for(int i=0; i<nQueries; i++){
            
            int query = scan.nextInt();
            
            if(query == 1){
                solveQueryOne(scan.nextInt(), scan.nextInt());
            }
            
            else if(query == 2){
                solveQueryTwo(scan.nextInt(), scan.nextInt());
            }
        }  
    }
    
    
    // solve query One:
    private static void solveQueryOne(int x, int y){
        int index = findIndex(x, y);
        
        if(!mainSequence.isEmpty()){   
            if(!mainSequence.get(index).isEmpty()){              
                mainSequence.get(index).add(y);
            } else{
                ArrayList<Integer> tempInternalList = new ArrayList<>();
                tempInternalList.add(y);
                mainSequence.set(index,tempInternalList);                       
            } 
        } else{
            ArrayList<Integer> tempInternalList = new ArrayList<>();
            tempInternalList.add(y);
            mainSequence.set(index,tempInternalList);
        }  
    }
    
    // solve query Two:
    private static void solveQueryTwo(int x, int y){
        int index = findIndex(x, y); // find index
        
        int seqSize = mainSequence.get(index).size(); 
        lastAnswer = mainSequence.get(index).get(y%seqSize);
        
        System.out.println(lastAnswer);
    }
    
    // find index
    private static int findIndex(int x, int y) {
        return ((x^lastAnswer)%nSequences);
    }
    
    // initialize arrays:
    private static void initializeArryList(){
        mainSequence = new ArrayList<>();
    }
    
    

}








