//Box class
class Box{
	int height;
	int width;
	int depth;
	
	Box(){
		System.out.println("Constructor");
		height = 17;
		width = 84;
		depth = 39;
	}
	
	double volume(){
		return height*width*depth;
	}
}

//Main class
public class ConstructorDemo{
    public static void main(String[] args){
    Box mybox = new Box();
    System.out.println("Volume is: " + mybox.volume());
    }
}