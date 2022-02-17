/*
There are two -element arrays of integers,  and . Permute them into some  and  such that the relation  holds for all  where .

There will be  queries consisting of , , and . For each query, return YES if some permutation ,  satisfying the relation exists. Otherwise, return NO.

Example

A valid  is  and :  and . Return YES.

Function Description

Complete the twoArrays function in the editor below. It should return a string, either YES or NO.

twoArrays has the following parameter(s):

int k: an integer
int A[n]: an array of integers
int B[n]: an array of integers
Returns
- string: either YES or NO
*/

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'twoArrays' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts following parameters:
     *  1. INTEGER k
     *  2. INTEGER_ARRAY A
     *  3. INTEGER_ARRAY B
     */

    public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
        Collections.sort(A);
        Collections.sort(B);
        
        int aIndex = 0, bIndex = B.size() - 1;
        while(aIndex < A.size() && bIndex >= 0) {
            if(A.get(aIndex) + B.get(bIndex) < k) return "NO";
            aIndex++;
            bIndex--;
        }
        return "YES";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

                int n = Integer.parseInt(firstMultipleInput[0]);

                int k = Integer.parseInt(firstMultipleInput[1]);

                List<Integer> A = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                List<Integer> B = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                    .map(Integer::parseInt)
                    .collect(toList());

                String result = Result.twoArrays(k, A, B);

                bufferedWriter.write(result);
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
