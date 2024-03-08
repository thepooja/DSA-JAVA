import java.util.Scanner;

public class TestPrime {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        reverseNumber(n);
    }

    private static void reverseNumber(int n){
        while ( n !=0){
            int div = n % 10;
            System.out.println(div);
            n = n / 10;
        }
    }
}
