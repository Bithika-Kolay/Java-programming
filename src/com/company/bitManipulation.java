package com.company;

public class bitManipulation {
    public static void main(String[] args) {
        /*get
        int n = 5;
        int pos = 2;
        int bitMask = 1<<pos;
        if((bitMask & n ) == 0){
            System.out.println("The bit is zero");
        }
        else{
            System.out.println("The bit is 1");
        }*/
        /*set
        int n = 5;
        int pos = 3;
        int bitmask = 1<<pos;
        int newNumber = bitmask | n;
        System.out.println(newNumber);

         */
        int n= 5;
        int pos = 2;
        int bitMask = 1<<pos;
        int newBitmask = ~ ( bitMask );
        int newNumber = newBitmask & n;
        System.out.println(newNumber);
    }
}
