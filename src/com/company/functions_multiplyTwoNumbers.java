package com.company;
import java.util.Scanner;

public class functions_multiplyTwoNumbers {
    public static int multiplyTwoNumbers(int a,int b){
        int product = a*b;
        return product;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int product = multiplyTwoNumbers(a,b);
        System.out.println(product);

    }
}
