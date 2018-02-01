// Use an array to pass a variable number of
// arguments to a method. This is the old-style
// approach to variable-length arguments.

// logic class
class VarLenArgs{
	
	// method to take array as input and display its details
	 void array(int a[]){
		System.out.print("Number of elements are: " + a.length +" "+ "Contents: ");
	
		for(int i : a)
			System.out.print(i + " ");
	}
}

// main class
class VarLenArgsTest{
	public static void main(String[] args){
		VarLenArgs obj = new VarLenArgs();
		// Declaring and defining arrays to test.
		int array1[] = {1,2,3,4,5,6};
		//int arr2[] = {a,b,c,u,v,w,x,y,z};
		
		// calling ...method, with array 1
		obj.array(array1);
		
		// calling ...method, with array 2
		//arr(arr2);
	}
}