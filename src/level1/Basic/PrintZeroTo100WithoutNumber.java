package level1.Basic;

public class PrintZeroTo100WithoutNumber {
    public static void main(String[] args) {
        //Solution - I
        String str = "NADOS";
        int zero = str.length() - str.length();
        int hundred = (str.length() + str.length()) * (str.length() + str.length());

        for(int i = zero; i <= hundred; i++){
            System.out.print(i + " ");
        }
        System.out.println();




        //Solution - II
        // a ASCII Value - 97 & d ASCII Value - 100
        for(int i = 'a' - 'a'; i <= 'd'; i++){
            System.out.print(i + " ");
        }
        System.out.println();

    }
}
