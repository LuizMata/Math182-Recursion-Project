
public class HelloWorld {

    public static void main(String[] args) {
        recursiveSum(5);
        System.out.println(quickSum(5));
    }

    //Iterative method
    public static int quickSum(int N) {
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = sum + i;
        }

        return sum;
    }

    //Recursive method
    public static void recursiveSum(int N) {
        int sum = 0;
        sum += (N * (N + 1)) / 2;

        if (N > 0) {
            System.out.println(sum);
        } else {
            recursiveSum(N-1);
        }

    }
}
