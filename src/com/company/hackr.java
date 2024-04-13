package com.company;
import java.util.Scanner;
public class hackr {


        public static void main(String[] args) {
            System.out.println("enter your value of a:- ");
            Scanner sc= new Scanner(System.in);
            int a = sc.nextInt();
            //sc.close();
            System.out.println("enter your value of b:- ");
            Scanner sca= new Scanner(System.in);
            int b = sca.nextInt();
            //sca.close();
            System.out.println("enter your value of c:- ");
            Scanner scan= new Scanner(System.in);
            int c = scan.nextInt();
           // scan.close();
            System.out.println("your answer is :-");

            if(a>b && a>c  ) {
                System.out.println(a);
            }
            else if ( (b > c && b>a)) {
                System.out.println(b);
            }
            else {
                System.out.println(c);
            }

        }

    }

