package level1.recursion;

import java.util.Scanner;

public class TowerofHanoi {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int t1 = scanner.nextInt();
        int t2 = scanner.nextInt();
        int t3 = scanner.nextInt();

        toh(n,t1,t2,t3);
    }

    private static void toh(int d, int t1,int t2, int t3){

        if(d == 0){
            return;
        }
        toh(d-1,t1,t3,t2);
        System.out.println(d +" [ "+ t1 + " -> " + t2 + " ] ");
        toh(d-1,t3,t2,t1);
    }
}
