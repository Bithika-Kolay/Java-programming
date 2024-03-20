package com.company;

public class Recursion3 {
    public static void printStringRev(String str, int index){
        if(index==0){
            System.out.println(str.charAt(index));
            return;

        }
        System.out.println(str.charAt(index));
        printStringRev(str,index-1);
    }
    public static void main(String[] args) {
        String str = "abcd";
        int index = str.length()-1;
        printStringRev(str,index);
        //time complexity = O(n);n = str.length();


    }
}
