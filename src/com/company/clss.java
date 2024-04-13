package com.company;

public class clss {
    static void table(int tnum){
       int temp;
       for(int i=1; i<=10;i++){
           temp=tnum*i;
           System.out.println(+tnum+"*"+i+"="+temp);
       }
    }
    public static void main(String[] args) {
table(2);
    }
}
