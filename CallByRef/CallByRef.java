// Test class.
class Test{
	// Declaring instance variables.
	int a,b;
	
	// Constructor Definition.
	Test(int i, int j){
		a = i;
		b = j;
	}
	
	void Calc (Test input){
	input.a *= 69;
	input.b *= 96;
	}
}


// Main class.
public class CallByRef{
	// Main method.
	public static void main(String[] args){
		
	// Declaring Object of Test class.
	Test obj = new Test(83,28);
	
	System.out.println("Values of a and b before call: " + obj.a + " " + obj.b);
	
	// Calling Method for calculation.
	obj.Calc(obj);
	
	System.out.println("Values of a and b after call: " + obj.a + " " + obj.b);
	}
}