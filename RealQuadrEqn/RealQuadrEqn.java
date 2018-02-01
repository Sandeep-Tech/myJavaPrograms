import java.util.Scanner;

// Calculation class
class EqnSoln{
	// Instance Variables.
	int a,b,c;
	
	// Calculating Method.	
	void Calc(){
		
	// Declare Scanner object.
	Scanner input = new Scanner(System.in);
	
	// Ask user for input.
	System.out.print("Enter values of a, b and c: ");
	
	// Take input.
	a = input.nextInt();
	b = input.nextInt();
	c = input.nextInt();
	
	if(((b*b)-(4*a*c)) < 0){
		System.out.println("The Equation does not have any real roots.");
	}
	
	else{
		double answer1 = ((-b)+(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		double answer2 = ((-b)-(Math.sqrt((b*b)-(4*a*c))))/(2*a);
		
		System.out.println("Hence the roots of given equation are: " + answer1 + "and" + answer2);
	}
	
	}
}


// Main class
class RealQuadrEqn{
	public static void main(String[] args){
		EqnSoln ans = new EqnSoln();
		
	ans.Calc();
	}
}