package Homeworkweek6;

import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        int p1,p2,p3,op;
        Scanner adj = new Scanner(System.in);
        System.out.println("Input the First number");
        p1 = adj.nextInt();
        System.out.println("Input the second number");
        p2 = adj.nextInt();

        System.out.println("option Available");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("Enter your option");
        op = adj.nextInt();
        switch (op){

            case 1:
                p3 = p1 + p2;
                System.out.println("Addition =" +p3);
                break;
            case 2:
                p3 = p1 - p2;
                System.out.println("Subtraction =" +p3);
                break;

            case 3:
                p3 = p1 * p2;
                System.out.println("Multiplication =" +p3);
                break;
            case 4:
                p3 = p1 / p2;
                System.out.println("Division =" +p3);
                break;
            default:
                System.out.println("you have to enter wrong option");
                adj.close();




        }







    }
   }





