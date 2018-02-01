// Implementing Queue data structure
import java.util.*;
class mainClass{
	
	// global variables 
	static int front=0,rear=0;
	static int array[] = new int[10];
	
	//main method
	public static void main(String args[]){
		// variable declaration
		int runChoice=0,opChoice=0;
		
		Scanner scan = new Scanner(System.in);
		
		// user control menu
		
		do{
			System.out.println("***Select option***:");
			System.out.println("1 to enqueue an element.");
			System.out.println("2 to dequeue element.");
			System.out.println("3 to view element.");
			System.out.print("Your Option: ");
			opChoice = scan.nextInt();
			switch(opChoice){
				case 1: enqueue();
				break;
				
				case 2: dequeue();
				break;
				
				case 3: view();
				break;
				
				default: System.out.println("Invalid input!");
			}
			
			System.out.print("Enter 1 to continue operation: ");
			runChoice = scan.nextInt();
		}while(runChoice==1);
	}
	
	public static void enqueue(){
		int input;
		Scanner scan = new Scanner(System.in);

		if(front == 9)
			System.out.println("Queue is full.");
		
		else{
			System.out.print("Enter your input: ");
			input = scan.nextInt();
			array[front] = input;
			front++;
		}
	}
	
	public static void dequeue(){
		if(front == rear){
			System.out.println("Queue is empty");
			front = rear = 0;
		}
		
		else{
			System.out.println("The value is: " + array[rear]);
			rear++;
		}
	}
	
	public static void view(){
		if(front == rear){
			System.out.println("Queue is empty");
			front = rear = 0;
		}
		
		else{
		System.out.println("The front data is: " + array[rear]);
		}
	}
	
	
}