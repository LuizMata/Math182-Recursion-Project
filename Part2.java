import java.util.Scanner;
public class Part2 {
    static int[] storage = new int[100];
    static int i = 2;
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
         Fibonacci(input.nextInt());

    }

    /**
     * Recursive function that returns the nth fibonacci number
     * @param F the fibonacci number F(n)
     */
    public static void Fibonacci(int F){
        int number=2;
        storage[0]=2;
        storage[1]=3;
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

}
