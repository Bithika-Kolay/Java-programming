package com.company;

public class recursionPrintSum {
    public static void printSum(int i,int n,int sum){
        if(i==n){
            sum +=i;
            System.out.println(sum);
            return;
        }
        sum = sum+i;
        printSum(i+1,n,sum);
        System.out.println(i);

    }
    public static void main(String[] args) {
        int i = 1;
        int n = 5;
        printSum(i,n,0);

    }
}
