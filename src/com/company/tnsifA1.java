package com.company;
import java.util.Scanner;
public class tnsifA1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter your name");
        String a=sc.nextLine();
        Scanner sy=new Scanner(System.in);
        System.out.println("enter your source");
        String b=sc.nextLine();
        Scanner ab=new Scanner(System.in);
        System.out.println("enter your destination");
        String c=sc.nextLine();


        System.out.println("Dear " +a+ " Welcome onboard with services from " +b+ " to " + c+ " thank you for choosing sky airline enjoy your journey" );
    }
}
