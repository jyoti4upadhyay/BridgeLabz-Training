import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'circularArrayRotation' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER k
     *  3. INTEGER_ARRAY queries
     */

    public static List<Integer> circularArrayRotation(
        List<Integer> a,
        int k,
        List<Integer> queries
    ) {

        List<Integer> ls = new ArrayList<>();
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        List<Integer> rev = new ArrayList<>();

        // reverse whole
        for (int j = a.size() - 1; j >= 0; j--) {
            ls.add(a.get(j));
        }

        k = k % a.size();

        // reverse k element
        for (int j = k - 1; j >= 0; j--) {
            left.add(ls.get(j));
        }

        for (int p = a.size() - 1; p >= k; p--) {
            right.add(ls.get(p));
        }

        rev.addAll(left);
        rev.addAll(right);

        List<Integer> res = new ArrayList<>();

        for (int i = 0; i < queries.size(); i++) {
            int value = queries.get(i);
            res.add(rev.get(value));
        }

        return res;
    }
}

public class CircularArrayRotation {

    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader =
            new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bufferedWriter =
            new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput =
            bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        int n = Integer.parseInt(firstMultipleInput[0]);

        int k = Integer.parseInt(firstMultipleInput[1]);

        int q = Integer.parseInt(firstMultipleInput[2]);

        String[] aTemp =
            bufferedReader.readLine()
                .replaceAll("\\s+$", "")
                .split(" ");

        List<Integer> a = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            int aItem = Integer.parseInt(aTemp[i]);
            a.add(aItem);
        }

        List<Integer> queries = new ArrayList<>();

        for (int i = 0; i < q; i++) {
            int queriesItem =
                Integer.parseInt(bufferedReader.readLine().trim());

            queries.add(queriesItem);
        }

        List<Integer> result =
            Result.circularArrayRotation(a, k, queries);

        for (int i = 0; i < result.size(); i++) {

            bufferedWriter.write(
                String.valueOf(result.get(i))
            );

            if (i != result.size() - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}