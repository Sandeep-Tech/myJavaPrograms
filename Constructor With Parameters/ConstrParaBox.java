// object class.
class Box{

	// Declaring instance variables.
	int height;
	int width;
	int depth;

	// Defining Constructor.
	Box(int h, int w, int d){
		height = h;
		width = w;
		depth = d;
	}
	
	// Calculating volume.
	double volume(){
	return height*width*depth;
	}
}

//main class
public class ConstrParaBox{
	// Main method
	public static void main(String[] args){
		
		// Creating object/instance of "Box" class and passing arguments to the constructor.
		Box mybox1 = new Box(19,15,5);
		
		// Calling volume method from object to calcute volume. Then printing the volume.
		System.out.println("Volume 1 is: " + mybox1.volume());
	}

}