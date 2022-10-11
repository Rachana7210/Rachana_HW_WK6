package Homeworkweek6;

import java.util.Scanner;

public class Program18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number");
        int n1 = sc. nextInt();
        System.out.println("Input the second number");
        int n2 = sc.nextInt();
        int sum = n1 + n2;
        int multiply = n1 * n2;
        int subtract = n1 - n2;
        int divide = n1 / n2;
        int rnum = n1 % n2;
        System.out.printf("sum =%d\nMultiply = %d\nSubtract = %d\nDivide = %d\nRemainderof2Number = %d\n", sum,multiply,subtract,divide,rnum);


    }


}
