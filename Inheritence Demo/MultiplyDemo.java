// testing inheritence


/*
THIS IS NOT FINISHED: THE INPUT FROM COMMAND LINE IS TAKEN AS STRING AND AS OF NOW I DON'T KNOW HOW TO CONVERT IT INTO INTEGER AND GET THE WORK DONE.
*/


// addition class
class add{
	int sum(int ...arguments){
		int res = 0;
		for(int x : arguments)
			res = x + res;
		return res;
	}
}

/* multiplication class
class  multiply extends add{
	int times(){
		
	}
}
*/
class MultiplyDemo{
	public static void main(String[] args){
		System.out.print("Entered numbers are: ");
		
		for(String x : args)
			System.out.print( x + " ");
		
		add objadd = new objadd();
		int result = objadd.sum(args);
		System.out.println("sum is: " + result);
	}
}