package com.company;
import java.util.Scanner;

public class CWH_18_elseif {
    public static void main(String[] args) {
        System.out.println("Enter ur age");
        Scanner sc = new Scanner(System.in);
        int age;
        age = sc.nextInt();

        if (age>56){
            System.out.println("You are experienced");
        }
        else if(age>46){
            System.out.println("You are semi experienced");
        }
        else if(age>36){
            System.out.println("You are semi semi experienced");
        }
        else{
            System.out.println("You are not experienced");
        }
    }
}
