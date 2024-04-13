package com.company;

public class recersive {
    static int rec(int n) {
        if (n ==0) {
            return 1;
        }
        else {
            return n * rec(n - 1);
        }
    }

    public static void main(String[] args) {

        System.out.println("the sum of N number is  " +rec(4));
    }
}




