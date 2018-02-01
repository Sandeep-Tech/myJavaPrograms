// Inheritense example.
// use of super to call constructor of immediate super class.

// super implemented here to call the particular members from immediate superclass. (in the case here, hidden superclass variable due to use of same identifier in subclass.

// super class
class superClass{
	int a;
}

// subclass
class sub extends superClass{
	// local variable
	int a;
	// constructor
	sub(int u, int v){
		super.a = u;
		a = v;
	}
	
	// Displaying the values of the variables.
	void display(){
		System.out.println("Values of superClass a and subClass a: " + super.a + " and " + a);
	}
}
// main class.
class superDemo{
	public static void main(String[] args){
		sub obj = new sub(6,9);
		
		obj.display();
	}
}


