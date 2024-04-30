package level1.recursion;

public class factorial {

    public static void main(String[] args) {
        factorial f1 = new factorial();
        System.out.println(f1.factorial_r(5));
    }

    public int factorial_r(int n){
        if(n==0){
            return 1;
        }
        int fm1 = n*factorial_r(n-1);
        return fm1;
    }
}


/*
* #write a program for recursive fibonacci series


public void fib(int n){

    if(n == 0){

    return}
    int f1 = fib(n-1);

    int f = f+f1;
    sout(f);
}

f1 = 1
 = 2
 = 3
= 4
 = 5

 f => 1
 f => 1*2
 f => 2*3
 f => 6*4
 f =>


*
* */
