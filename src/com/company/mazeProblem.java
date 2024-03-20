package com.company;

public class mazeProblem {
    public static int count(int r, int c){
        if(r==2 || c==2){
            return 1;
        }
        int down = count(r+1,c);
        int right = count(r,c+1);
        int total = down + right;
        return total;
    }
    public static void main(String[] args) {
       int result= count(0,0);
        System.out.println(result);

    }
}
