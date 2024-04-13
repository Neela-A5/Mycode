package com.company;


public class primenum {
    public static void main(String[] args) {
        int n=5,count=0;

        if(n>1 || n==0){
            for (int i=1;i<=n;i++){
                if (n%i==0)
                  count ++;
            }
            if(count==2){
                    System.out.println("this is a prime number");
            }
            else{
                    System.out.println(" this is not a prime number");
            }

        }
      else{
            System.out.println(" this is not a prime number");
        }
    }
}
