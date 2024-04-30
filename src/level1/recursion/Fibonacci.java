package level1.recursion;

public class Fibonacci {
    public static void main(String[] args) {

        int n = 10;

        int fib = fibonacci(n);

        System.out.println(fib);

    }

    // write a recursive function for fibonacci
    private static int fibonacci(int n){
        if(n <=1){
            return n;
        }

        int fib = fibonacci(n-1) + fibonacci(n-2);

        return fib;
    }
}
