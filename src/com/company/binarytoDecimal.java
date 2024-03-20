package com.company;


public class binarytoDecimal {
    public static void main(String[] args) {
     int num = 10;
     String binary = "";
        System.out.println(num);
     while(num!=0){
        binary= (num&1)+binary;
        num= num>>1;
     }
        System.out.println(binary);
     binary=binary.replaceAll("0","2");
     binary = binary.replaceAll("1","0");
    binary = binary.replaceAll("2","1");
        System.out.println(binary);
        int result = Integer.parseInt(binary,2);
        System.out.println(result);
    }
}
