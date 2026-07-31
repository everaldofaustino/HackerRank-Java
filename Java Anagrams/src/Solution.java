import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */


        Scanner sc = new Scanner(System.in);

        String stringA = sc.nextLine().toLowerCase();
        String stringB = sc.nextLine().toLowerCase();

        List<Character> listA = new ArrayList<>();
        List<Character> listB = new ArrayList<>();

        List<Integer> list2A = new ArrayList<>();
        List<Integer> list2B = new ArrayList<>();

        char[] caracteresA = stringA.toCharArray();

        char[] caracteresB = stringB.toCharArray();



        Arrays.sort(caracteresA);
        Arrays.sort(caracteresB);



        for (char c : caracteresA){
            System.out.println(c);
            listA.add(c);
        }

        for (char c : caracteresB){
            System.out.println(c);
            listB.add(c);
        }

        Collections.sort(listA);
        System.out.println(listA);

        Collections.sort(listB);

        System.out.println(listA);




        int contagem = 1;

        for (int i = 1; i<listA.size();i++){



            if(listA.get(i) == listA.get(i - 1)){
               contagem++;


            }
            else{
                //list2.add(contagem);

                contagem =1;


            }


            list2A.add(contagem);

        }
        System.out.println(list2A);


        contagem = 1;
        for (int i = 1; i<listB.size();i++){



            if(listB.get(i) == listB.get(i - 1)){
                contagem++;


            }
            else{
                //list2.add(contagem);

                contagem =1;


            }


            list2B.add(contagem);

        }
        System.out.println(list2B);

        if(list2A.equals(list2B)&& Arrays.equals(caracteresA, caracteresB)){

            System.out.println("Anagrams");
        }

        else {
            System.out.println("Not Anagrams");
        }






    }
}