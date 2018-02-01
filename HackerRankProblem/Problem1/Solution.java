/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package HackerRankProblem.Problem1;
import java.util.*;

/**
 *
 * @author Sandeep Sharma
 */
public class Solution {
    static int[][] matrix = new int[6][6];
    static Scanner scan = new Scanner(System.in);
    static int maxSum = 0;
    
    // main method
    public static void main(String[] args) {
        
        System.out.println("enter input:"); // delete in final code
        takeInput(); // takes input
        System.out.println("greatest sum is: " + findGreatestBlock());  
    }
    
    // take input
    private static void takeInput(){
        for(int row=0; row<6; row++){
            for(int column=0; column<6; column++){
                matrix[row][column] = scan.nextInt();
            }
        }
    }
    
    // calc block sum
    private static int blockSum(int row, int column){
        int rowTimes=0, columnTimes=0, sum=0;
        boolean isHourglass;
        
        for(int i=row; rowTimes<3; i++){
            for(int j=column; columnTimes<3; j++){
                isHourglass = ((rowTimes ==1) && (columnTimes==0 || columnTimes==2));
                if(!isHourglass){ 
                    sum = sum + matrix[i][j];
                }
                columnTimes++;
            }
            columnTimes=0;
            rowTimes++;
        }
        
        return sum;
    }
    
    // find block with greatest sum value(of its elements)
    private static int findGreatestBlock(){
        int tempMaxSum=blockSum(0, 0);
        
        for(int row=0; row<4; row++ ){
            for(int column=0; column<4; column++){
                if(tempMaxSum < blockSum(row,column)){
                    tempMaxSum = blockSum(row, column);
                }
            }
        }
        
        return tempMaxSum;
    }
    
}
