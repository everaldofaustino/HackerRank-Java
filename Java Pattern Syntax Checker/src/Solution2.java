import java.io.*;
import java.util.*;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Solution2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);
        List<String> list = new ArrayList();
        int testCases = sc.nextInt();
        sc.nextLine();

        while(list.toArray().length<= testCases-1 ){

            String pattern = sc.nextLine();

            try{
                Pattern.compile(pattern);
                list.add("Valid");}




            catch(PatternSyntaxException e){
                list.add("Invalid");


            }



        }

        for (String elemento:list){
            System.out.println(elemento);
        }


    }
}