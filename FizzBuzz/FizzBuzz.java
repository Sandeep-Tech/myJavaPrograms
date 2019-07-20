package FizzBuzz;

public class FizzBuzz {
    // FizzBuzz is a simple childen's game
    // here is how it goes:
    // participants count number starting with 1
    // each person says one number
    // but at the numbers, mulitple of three, participant must say "Fizz"
    // similarly for numbers, multiple of five, participant must say "Buzz"
    // and for a number, multiple of both three and five, participant must say FizzBuzz
    // in this program, I implement a version Tom Scott suggests in this video(https://youtu.be/QPZ0pIK_wsc):
    // program that prints numbers conforming to above stated rule upto one hundred.
    
    public static void main(String[] args) {
        FizzBuzz();
    }
    
    public static void FizzBuzz(){
        int number = 1;
        while(number <= 100){   
            boolean fizzCondition = number%3 == 0;
            boolean buzzCondition = number%5 == 0;
            
            if(fizzCondition && buzzCondition){
                System.out.println("FizzBuzz");
            }
            else if(fizzCondition){
                System.out.println("Fizz");
            }
            else if(buzzCondition){
                System.out.println("Buzz");
            }
            else{
                System.out.println(number);
            }
            number++;
        }
    }
}
