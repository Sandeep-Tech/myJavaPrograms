class box{
    int height;
    int width;
    int depth;
    
    //Input Method. 
    void Dim(int h, int w, int d){
    height = h;
    width = w;
    depth = d;
}
    //Define Method to Calculate volume
    double volume(){
            return height*width*depth;
    }
    
}
//Main Class 
public class BoxDemo {
    //Main Method
    public static void main(String[] args){
    
    //Declare Objects.
    box mybox1 = new box();
    box mybox2 = new box();
    
    //Accessing and sending arguments to Dim method in mybox1 and mybox2, objects.
    mybox1.Dim(3, 6, 9);
    mybox2.Dim(10, 15, 20);
    
    //print volume from mybox1 object.
    System.out.println("Volume 1 is: " + mybox1.volume());
    //print volume from mybox2 object.
    System.out.println("Volume 2 is: " + mybox2.volume());
    }
    
}