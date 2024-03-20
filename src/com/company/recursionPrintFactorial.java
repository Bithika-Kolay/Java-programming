package com.company;

public class recursionPrintFactorial {
    public static void printFactorial(int i,int n,int factorial){
        if(i==5){
            factorial=factorial*i;
            System.out.println(factorial);
            return;
        }
        factorial = factorial*i;
        printFactorial(i+1,5,factorial);
        System.out.println(i);

    }
    public static void main(String[] args) {
        printFactorial(1,5,1);

    }

}
