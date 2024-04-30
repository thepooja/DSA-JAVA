package level1.Basic;

public class CountPrimeNumberTillN {


    public static void main(String[] args) {

        CountPrimeNumberTillN.countPrime(10);
    }

    private static void countPrime(int x)
    {
        int cnt =0;

        for (int i = 2; i <x ; i++) {
                int count = 0;
            for (int j = 2; j <x ; j++) {
                if(i%j == 0)
                {   count++;
                }
            }

            if(count<2)
            {
                cnt++;
            }
        }

        System.out.println(cnt);

    }
}
