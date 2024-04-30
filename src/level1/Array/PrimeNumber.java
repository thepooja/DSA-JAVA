package level1.Array;

public class PrimeNumber {

    public static void main(String[] args) {

        PrimeNumber.prime(20);

    }

    static void prime(int number) {

        for (int i = 0; i <number ; i++) {

            int count =0;
            for (int div = 1; div <= i ; div++) {

                if (i%div == 0)
                {
                    count++;
                }
            }

            if (count == 2)
            {
                System.out.println("Prime -- "+i);
            }
        }
    }

    static void optimiseSolutionPrime(int number)
    {

        for (int i = 0;  i<= number ; i++) {


            // Check sqaureroot
            for (int div = 2; div*div <= i ; div++) {

                if (i%div == 0)
                {

                }
            }
        }
    }

    static void rangePrime(int low, int high)
    {

    }

}
