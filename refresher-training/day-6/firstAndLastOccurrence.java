import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'findFirstLast' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY arr
     *  2. INTEGER target
     */

    public static List<Integer> findFirstLast(
            List<Integer> arr, int target) {

        List<Integer> result = new ArrayList<>();
        int idx1=-1;
        int idx2=-1;

        for(int i=0;i<arr.size();i++){
            if(target==arr.get(i)){
                idx1=i;
                break;
            }
        }
        for(int i=arr.size()-1;i>idx1;i++){
            if(target ==arr.get(i) && idx1!=i){
                idx2=i;
                break;
            }
        }
        result.add(idx1);
        result.add(idx2);

        return result;
    }
}

public class firstAndLastOccurrence {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(
                new FileWriter(System.getenv("OUTPUT_PATH"))
            );

        int n = Integer.parseInt(
            bufferedReader.readLine().trim()
        );

        String[] arrTemp =
            bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        List<Integer> arr = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrTemp[i]);
            arr.add(arrItem);
        }

        int q = Integer.parseInt(
            bufferedReader.readLine().trim()
        );

        for (int i = 0; i < q; i++) {

            int target = Integer.parseInt(
                bufferedReader.readLine().trim()
            );

            List<Integer> result =
                Result.findFirstLast(arr, target);

            bufferedWriter.write(
                target + " " +
                result.get(0) + " " +
                result.get(1)
            );

            bufferedWriter.newLine();
        }

        bufferedReader.close();
        bufferedWriter.close();
    }
}