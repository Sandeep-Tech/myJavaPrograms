// Test class.
class Test{
	
	// Declaring instance variable.
	int a;
	
	// Constructor Definition.
	Test(int i){
	a=i;		
	}
	
	// Calculating method with return type, "Test"
	Test IncrTen(){
		Test temp = new Test(a+10);
		return temp;
	}
}

//Main class.
class RtnObj{
	
	// Define Main method.
	public static void main(String[] args){
	
	// Creating Objects of Test class.
	Test ob1 = new Test(7);
	Test ob2;
	
	// Calling IncrTen method to assign value to ob2.
	ob2 = ob1.IncrTen();
	
	// Printing new incremented value.
	System.out.println("Value of ob2.a: " + ob2.a);
	
	// Calling IncrTen method again.
	ob1 = ob1.IncrTen();
	
	// Printing new changes in object 1.
	System.out.println("Value of a in ob1: " + ob1.a);
	}
}
















