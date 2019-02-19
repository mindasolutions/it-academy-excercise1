import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainClass {
    public static void main(String[] args) {
        // get 'a' variable from user
        System.out.print("Type a: ");
        Scanner takeA  = new Scanner(System.in);
        int a = takeA.nextInt();

        // get 'b' variable from user
        System.out.print("Type b: ");
        Scanner takeB = new Scanner(System.in);
        int b = takeB.nextInt();

        //initialize class with variable
        CalculatorClass result = new CalculatorClass(a, b);

        //output result
        System.out.println(a + " * " + b + " = " + result.multiplyNumbers());
        if(b == 0){
            System.out.println("You cannot divide by 0!");
        } else {
            System.out.println(a + " / " + b + " = " + result.divideNumbers());
        }
    }
}
