package com.company;

public class primenumber2 {
   /* public static void main(String[] args) {
        int n=3,count=0;
        if(n>1 || n==0){
            for(int i=1;i<=n;i++){
                if(n%i ==0)
                    count++;
            }
                if (count ==2){
                    System.out.println("this is a prime number");
                }
                else{
                    System.out.println("this is not a prime number ");
                }

            }
        else {
            System.out.println("this is not a prime number ");
        }
    }*/
   static void checkint(int n ){
      int i,m,count=0;
      m=n/2;
      if(n>0){
         for (i=2;i>=m;i++){
            if(n%i==0){

            }
         }

      }
      else {
         System.out.println(+n+"this is not a prime number");
      }
   }
   public static void main(String[] args) {
checkint(4);
      checkint(3);
      checkint(5);
   }
}
