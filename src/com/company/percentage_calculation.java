package com.company;
import java.util.Scanner;
public class percentage_calculation {
    public static void main(String[] args) {
        System.out.println("enter the 3 number of marks");
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the marks of sub 1");
        float a = sc.nextFloat();

        System.out.println("enter the marks of sub 2");
        float b = sc.nextFloat();

        System.out.println("enter the marks of sub 3");
        float c = sc.nextFloat();
        System.out.println("total sum of three numbers is");

       // System.out.println("total number");
       // float total_number = (a + b + c);
       // System.out.println(total_number);
        float sum = a+b+c;
        System.out.println(sum);

        //System.out.println("Total Percentage is ");
       // float percentage = (sum / 300)*100;
       // System.out.println(percentage);



    }
}




