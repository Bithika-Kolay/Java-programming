package com.company;
import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;
public class Array_2D_apnaCollege {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int[][] numbers = new int[rows][cols];
        for (int i = 0; i < rows; i++){
            for(int j= 0;j<cols;j++){
                numbers[i][j] = sc.nextInt();
            }

        }
        int x = sc.nextInt();
        for(int i =0;i<rows;i++){
            for(int j =0;j<cols;j++){
               // System.out.print(numbers[i][j] + " ");
                if(numbers[i][j] == x){
                    System.out.println("x found at index (" + i + "," + j + ")");
                }
            }
           // System.out.println();
        }
    }
}
