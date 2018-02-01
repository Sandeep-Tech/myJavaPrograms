// functioning class.
class ArrRecDemo{
	
	// Declaring an array.
	int Array[];
	
	// Initializing with constructor
	ArrRecDemo(int i){
		Array = new int[i];
	}
	
	// Array printing method.
	void PrintArray(int n){
		if(n == 0){
		return;
		}
		
		else{
		PrintArray(n-1); 
		}
		
		System.out.println("[" + n + "] " + Array[n]);
	}
}

// main class.
class ArrRec{
	public static void main(String[] args){
		
	// Creating ArrRecDemo class object. sets size of array as 10
	ArrRecDemo obj = new ArrRecDemo(10);
	
	// Adding elements in array.
	for(int j = 0; j<10; j++){
		obj.Array[j] = j;
		}
	
	// calling print method'
	obj.PrintArray(10);
	}
}
