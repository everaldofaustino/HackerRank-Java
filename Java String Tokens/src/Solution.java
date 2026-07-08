import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner sc = new Scanner(System.in);
        String text =  sc.nextLine();
        String[] parts = text.trim().split("[ !,?._'@]+");

        //System.out.println(parts.length);

        int contador = 0;

        for(String texto:parts){
            if(!texto.isEmpty()){

                contador++;
            }


        }
        System.out.println(contador);

        for(String texto:parts){
            if(!texto.trim().isEmpty()){

                System.out.println(texto);
            }


        }










    }

}