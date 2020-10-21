package SummerTrainingGFG.Hashing;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Vishal Singh
 */
public class WinnerElection {
    static void electionWinner(String[] arr,int n){
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            if (map.containsKey(arr[i])){
                map.put(arr[i],map.get(arr[i])+1);
            }
            else {
                map.put(arr[i],1);
            }
        }
        int maxValueInMap = 0;
        String winner = "";
        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            String key  = entry.getKey();
            Integer val = entry.getValue();
            if (val > maxValueInMap)
            {
                maxValueInMap = val;
                winner = key;
            }
            else if (val == maxValueInMap &&
                    winner.compareTo(key) > 0)
                winner = key;
        }
        System.out.println(winner+" "+maxValueInMap);
    }
    public static void main(String[] args) {
        String[] names = {"john", "johnny", "jackie", "johnny", "john",
                "jackie", "jamie", "jamie", "john", "johnny", "jamie", "johnny",
                "john"};
        electionWinner(names,names.length);

        names = new String[]{"john", "mike", "harry", "harry", "harry"};
        electionWinner(names,names.length);

    }
}
