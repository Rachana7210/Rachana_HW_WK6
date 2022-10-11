package Homeworkweek6;

import java.util.Scanner;

public class Program7 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter Temperature in Fahrenheit; ");
        double f = s.nextDouble();
        double c = (((f - 32) *5) / 9);
        System.out.println( "Degree celcius" +c);
    }
}