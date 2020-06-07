package SummerTrainingGFG.Strings;

import java.util.HashMap;
import java.util.HashSet;

/**
 * @author Vishal Singh
 */
public class CheckAnagram {
    /**
     * Using Hash map*/
    static boolean checkAnagram(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        HashMap<Character,Integer> set = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (set.containsKey(s1.charAt(i))){
                set.put(s1.charAt(i),set.get(s1.charAt(i))+1);
            }
            else {
                set.put(s1.charAt(i),1);
            }
        }
        for (int i = 0; i < s2.length(); i++) {
            if (set.containsKey(s2.charAt(i))){
                set.put(s2.charAt(i),set.get(s2.charAt(i))-1);
                if (set.get(s2.charAt(i)) == 0){
                    set.remove(s2.charAt(i));
                }
            }
        }
        return set.size() == 0;
    }
    /**
     * Using Array*/
    static boolean check(String s1,String s2){
        if (s1.length() != s2.length()){
            return false;
        }
        int[] count = new int[256];
        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i)]++;
            count[s2.charAt(i)]--;
        }
        for (int i = 0; i < 256; i++) {
            if (count[i] != 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String s1 = "vishal";
        String s2 = "lahsiv";
        System.out.println(checkAnagram(s1,s2));
        System.out.println(check(s1,s2));
    }
}
