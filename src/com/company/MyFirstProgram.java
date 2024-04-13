package com.company;
import java.util.Scanner;

public class MyFirstProgram {
    public static void main(String[] args) {
        System.out.println("10th   students marks into %");
        Scanner sc= new Scanner(System.in);
        System.out.println("the maximum marks should be 100");

        System.out.println("enter the 1st subject marks");
        float sub1= sc.nextFloat();

        System.out.println("enter the 2nd subject marks");
        float sub2= sc.nextFloat();

        System.out.println("enter the 13rd subject marks");
        float sub3= sc.nextFloat();

        System.out.println("enter the 4rt subject marks");
        float sub4= sc.nextFloat();

        System.out.println("enter the 5th subject marks");
        float sub5= sc.nextFloat();

        float add = (sub1 + sub2 + sub3 + sub4 + sub5)/5;

        System.out.println("Total marks in %");
        System.out.println(add);
    }
}
