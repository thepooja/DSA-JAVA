package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class GetStairPaths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);

    }

    private static ArrayList<String> getStairPaths(int n) {
        if(n == 0){
            ArrayList<String> b = new ArrayList<>();
            b.add("");
            return b;
        }
        if (n <0){
            ArrayList<String> b = new ArrayList<>();
            return b;
        }

        ArrayList<String> path1 = getStairPaths( n -1);
        ArrayList<String> path2 = getStairPaths( n -2);
        ArrayList<String> path3 = getStairPaths( n -3);

        ArrayList<String> paths = new ArrayList<>();
        for (String path:path1){
            paths.add("1"+path);
        }

        for (String path:path2){
            paths.add("2"+path);
        }

        for (String path:path3){
            paths.add("3"+path);
        }


        return paths;
    }


}
