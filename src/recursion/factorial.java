package recursion;

public class factorial {

    public static void main(String[] args) {
        factorial f1 = new factorial();
        System.out.println(f1.factorial_r(3));
    }

    public int factorial_r(int n){
        if(n==1){
            return 1;
        }
        int fm1 = factorial_r(n-1);
        int fn = fm1*n;
        return fn;
    }
}
