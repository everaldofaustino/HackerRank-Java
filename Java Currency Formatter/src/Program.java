import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Program {

    public static void main(String[] args) {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        double n = sc.nextDouble();




        NumberFormat dolarFormat = NumberFormat.getCurrencyInstance(Locale.US);


        System.out.println("US: " + dolarFormat.format(n) );


        NumberFormat indiaFormat = NumberFormat.getInstance();
        indiaFormat.setMinimumFractionDigits(2);
        indiaFormat.setMaximumFractionDigits(2);

        System.out.println("India: Rs." + indiaFormat.format(n));




        NumberFormat chinaFormat = NumberFormat.getCurrencyInstance(Locale.CHINA);

        System.out.println("China: " + chinaFormat.format(n) );

        NumberFormat franceFormat = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        System.out.println("France: " + franceFormat.format(n));

    }
}