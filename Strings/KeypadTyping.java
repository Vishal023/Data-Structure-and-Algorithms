package SummerTrainingGFG.Strings;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

/**
 * @author Vishal Singh
 */
public class KeypadTyping {
    static void preCompute(HashMap<Character, Integer> map){
        for (char i = 97; i <= 122; i++) {
            if (i<='c'){
                map.put(i,2);
            } else if (i<='f'){
                map.put(i,3);
            } else if (i<='i'){
                map.put(i,4);
            } else if (i<='l'){
                map.put(i,5);
            } else if (i<='o'){
                map.put(i,6);
            } else if (i<='s'){
                map.put(i,7);
            } else if (i<='v'){
                map.put(i,8);
            } else {
                map.put(i,9);
            }
        }
    }
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine());

        //Pre Compute
        HashMap<Character, Integer> map = new HashMap<>();
        preCompute(map);

        while (test-->0){
            String s = br.readLine();
            s = s.toLowerCase();
            for (int i = 0; i < s.length(); i++) {
                System.out.print(map.get(s.charAt(i)));
            }
            System.out.println("");
        }
    }
}
