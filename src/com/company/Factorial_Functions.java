package com.company;
import java.util.Scanner;
public class Factorial_Functions {
    public static void printFactorial(int n){
        int factorial = 1;
        for(int i=n;i>=1;i--){
            factorial *= i;
        }
        System.out.println(factorial);
    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      printFactorial(n);
    }
}
