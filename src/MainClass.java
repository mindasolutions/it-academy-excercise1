import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class MainClass {
    public static void main(String[] args) {
        //initialize default value
        int min = 0;
        int max = 50;

        int a = ThreadLocalRandom.current().nextInt(min, max + 1);
        int b = ThreadLocalRandom.current().nextInt(min, max + 1);

        // get 'a' variable from user
        System.out.print("Type a [" + a + "]: ");
        Scanner takeA  = new Scanner(System.in);
        //press enter to continue with default value
        if(!takeA.hasNextLine()){
            a = takeA.nextInt();
        }

        // get 'b' variable from user
        System.out.print("Type b [" + b + "]: ");
        Scanner takeB = new Scanner(System.in);
        //press enter to continue with default value
        if(!takeB.hasNextLine()){
            b = takeB.nextInt();
        }

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
