package level1.recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePathWithJump {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<String> getPaths = getMazePath(1,1,n,m);
        System.out.println(getPaths);

    }

    private static ArrayList<String> getMazePath(int sr, int sc, int dr, int dc){

        // base case
        if( sc == dc && sr ==dr){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }

        ArrayList<String> paths = new ArrayList<>();
        // horizontal paths
        for (int ms = 1; ms <= dc-sc ; ms++) {
            ArrayList<String> hpaths = getMazePath(sr, sc+ms, dr, dc);
            for (String path:hpaths){
                paths.add("h"+ms+path);
            }
        }

        //vertical paths
        for (int ms = 1; ms <= dr-sr ; ms++) {
            ArrayList<String> vpaths = getMazePath(sr+ms,sc,dr,dc);
            for (String path:vpaths){
                paths.add("v"+ms+path);
            }
        }

        // diagonal paths

        for (int ms = 1; ms <= dc-sc && ms<= dr-sr ; ms++) {
            ArrayList<String> dpaths = getMazePath(sr+ms,sc+ms,dr,dc);
            for (String path:dpaths){
                paths.add("d"+ms+path);
            }
        }

        return paths;
    }
}
