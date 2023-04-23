package com.gl.question1;

import java.util.Scanner;

public class AssembleFloors {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the total no of floors in the building ");
        int noOfFlores = sc.nextInt();
        int days[] = new int[noOfFlores + 1];
        for (int i = 1; i < noOfFlores + 1; i++) {
            System.out.println("enter the floor size given on day : " + i);
            int florSize = sc.nextInt();
            days[florSize] = i;
        }
        int j = noOfFlores;
        boolean flag;
        System.out.println("The order of construction is as follows ");
        for (int i = 1; i <= noOfFlores; i++) {
            flag = false;
            System.out.println("Day: " + i);
            while (j >= 1 && days[j] <= i) {
                flag = true;
                System.out.print(j + " ");
                j--;
            }
            if (flag == true) {
                System.out.println();
            }
        }
    }
}