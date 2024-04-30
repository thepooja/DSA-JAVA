package level1.Array;

import java.util.HashMap;
import java.util.Map;

public class Test1 {
    public static void main(String[] args) {
        String result = SearchingChallenge(new String[] {"X:-1", "Y:1", "X:-4", "B:3", "X:5"});
        HashMap<String , Integer> map = new HashMap<>();
        System.out.println(result);
    }

    public static String SearchingChallenge(String[] strArr) {
        // code goes here
        HashMap<String , Integer> map = new HashMap<>();
        for(String s : strArr){
            String part1 = s.substring(0 , s.indexOf(":"));
            int part2 = Integer.parseInt(s.substring(s.indexOf(":")+1));
            if(map.get(part1) == null){
                map.put(part1 , part2);
            }
            else{
                map.put(part1 , map.get(part1)+part2);
            }

        }
        String result = "";
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            if(entry.getValue() == 0){
                continue;
            }
            result += entry.getKey() + ":" + entry.getValue() +",";
        }

        return result.substring(0 , result.length()-1);
    }
}
