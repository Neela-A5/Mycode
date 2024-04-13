package com.company;
//import java.util.Scanner;
public class ptc2 {
    /*                          addition of 5 floating point sum
    public static void main(String[] args) {
        float a = 0.57f;
        float b = 1.7f;
        float c = 2.32f;
        float d = 3.82f;
        float e = 4.3f;
        float sum= (a+b+c+d+e)/2;
        System.out.println("the sum of five floating point is :- " +sum);
} */

    public static void main(String[] args) {


        float a = 5.65f;
        float sum;
        float[] arr ={2.65f,3.00f,5.75f,5.75f,6.45f};
        for(float element:arr){
           if(a==element){
               System.out.println("the given number is  present in an   array :- " +a);
           }
             else{
               System.out.println("the given number is not present in an array");
           }
        }






    }

}
