package com.company;

import java.util.Scanner;

public class vowel {
    public static void main(String[] args) {
        System.out.println(" enter your character ");
        Scanner sc = new Scanner(System .in );
        char a=sc.next().charAt(0);
        switch(a) {
            case 'a':
                System.out.println(" this is an vowel");
                break;
            case 'e':
                System.out.println(" this is an vowel");
                break;
            case 'i':
                System.out.println(" this is an vowel");
                break;
            case 'o':
                System.out.println(" this is an vowel");
                break;
            case 'u':
                System.out.println(" this is an vowel");
                break;
            case 'A':
                System.out.println(" this is an vowel");
                break;
            case 'E':
                System.out.println(" this is an vowel");
                break;
            case 'I':
                System.out.println(" this is an vowel");
                break;
            case 'O':
                System.out.println(" this is an vowel");
                break;
            case 'U':
                System.out.println(" this is an vowel");
                break;
            default:System.out.println(" this is an constant");

        }
    }
}