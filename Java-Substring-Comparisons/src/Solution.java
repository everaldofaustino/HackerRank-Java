import java.util.Scanner;
import java.util.*;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        List<String> list = new ArrayList<>();




        for(int i = 0; i<=s.length()-k;i++){

            String largest = s.substring(i,k+i);

            list.add(largest);
        }

        list.sort(null);


        String smallest = list.get(0);
        String largest = list.get(list.size()-1);


        return smallest +"\n" + largest;

        // Complete the function
        // 'smallest' must be the lexicographically smallest substring of length 'k'
        // 'largest' must be the lexicographically largest substring of length 'k'




    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int k = scan.nextInt();
        scan.close();

        System.out.println(getSmallestAndLargest(s, k));
    }
}
