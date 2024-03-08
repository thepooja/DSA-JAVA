package recursion;

import java.util.ArrayList;
import java.util.Scanner;

public class MazePaths {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        ArrayList<String> paths = getMazePaths(1,1,n,m);

        System.out.println(paths);
    }

    // sr - source row
    // sc - source column
    // dr - destination row
    // dc - destination column

    private static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        if(sc == dc || sr == dr){
            ArrayList< String> bres = new ArrayList< >();
            bres.add("");
            return bres;

        }

        ArrayList<String> hpaths = new ArrayList<>();
        ArrayList<String> vpaths = new ArrayList<>();

        if(sc < dc){
            hpaths = getMazePaths(sr,sc+1,dr,dc);
        }
        if (sr <dr){
            vpaths = getMazePaths(sr+1,sc,dr,dc);
        }

        ArrayList<String> paths = new ArrayList<>();
        for (String path: hpaths){
            paths.add("h"+path);
        }
        for (String path:vpaths){
            paths.add("v"+path);
        }

        return paths;
    }


}
