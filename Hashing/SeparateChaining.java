package SummerTrainingGFG.Hashing;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
/**
 * @author Vishal Singh
 */
public class SeparateChaining {
    static ArrayList<ArrayList<Integer>> separateChaining(int arr[], int n, int hashSize)
    {
        ArrayList<ArrayList<Integer>> hashTable = new ArrayList<>();
        for (int i = 0; i < hashSize; i++) {
            hashTable.add(new ArrayList<>());
        }
        for (int i = 0; i < n; i++) {
            int hashPos = arr[i]%hashSize;
            hashTable.get(hashPos).add(arr[i]);
        }
        return hashTable;
    }
    public static void main(String[] args)throws IOException {
        InputStream in = System.in;
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        int testCases = Integer.parseInt(br.readLine());
        while (testCases-->0){
            int hashSize = Integer.parseInt(br.readLine());
            int arraySize = Integer.parseInt(br.readLine());
            String[] strArr =  br.readLine().split(" ");
            int[] arr = new int[arraySize];
            for (int i = 0; i < arraySize; i++) {
                arr[i] = Integer.parseInt(strArr[i]);
            }
            System.out.println("");
            ArrayList<ArrayList<Integer>> arrayLists = separateChaining(arr,arraySize,hashSize);
            for (int i = 0; i < arrayLists.size(); i++) {
                if (arrayLists.get(i).size() != 0)
                System.out.println(i+"->"+arrayLists.get(i));
            }
        }
    }
}
