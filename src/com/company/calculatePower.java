package com.company;

public class calculatePower {
    public static int printPower(int x, int n){
        if(n==0){
            return 1;
        }
        if(x==0){
            return 0;
        }
        int x_ = printPower(x,n-1);
        int xn = x * x_;
        return xn;

    }
    public static void main(String[] args) {
        int x = 2;
        int n= 5;
       int ans = printPower(x,n);
        System.out.println(ans);

    }
}
