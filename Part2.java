import java.util.Scanner;
public class Part2 {
    static int[] storage = new int[100];
    static int c1 = 1;
    static int c2 = 1;
    static int i = 1;
    static int number = 1;
    /*pseudocode
             1. Start with 2 givens, in this case we start with 2 as our first value
                and 3 as our second value.
             2. Function will add the adjacent indexes up
             2. recursively call function until we reach that nth value we are going
                for
             */
    public static void main(String[] str){
        Scanner input = new Scanner(System.in);
        System.out.print("Which F number do you need?: ");
         FibonacciNoStorage(input.nextInt());

    }

    /**
     * Recursive function that returns the nth fibonacci number
     * @param F the fibonacci number F(n)
     */
    public static void Fibonacci(int F){
        int number=1;
        storage[0]=1;
        storage[1]=1;
        storage[i] = storage[i-1]+ storage[i-2];
        number = storage[i-1];

        if(i==F){
            System.out.println(number);
        }
        else{
            i++;
            Fibonacci(F);
        }
    }

    //Fibonacci sequence calculator using only static variables
    //Reduces amount of memory used

    public static void FibonacciNoStorage(int F){
        number = c2+c1;
        c1=c2;
        c2 = number;

        if(i == F){
            System.out.println(number -c1);
        }
        else{
            i++;
            FibonacciNoStorage(F);
        }


    }

}
