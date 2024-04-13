package com.company;

public class febo {


    /*      using without recursion :----------------------------
    public static void main(String[] args) {
        int a=0;
        int b=1;
       int count=10;
        System.out.print(+a+ " " +b);
       for(int i=2;i<count;++i){
           int c=a+b;
           System.out.println(c);
            a=b;
            b=c;}}
-------------------------------------------------------------------------           */



    /*-------------------------------------------------------------------------------------------using recursion --------
static int a=0, b=1, c;
static void printfebo(int count) {
    if (count > 0) {
        c = a + b;
        a = b;
        b = c;
        System.out.print(" "+c);
         printfebo(count-1);
    }
}
    public static void main(String[] args) {
int count=5;
        System.out.print(a+ "  "+b);
      printfebo(count);
    }---------================================================================------------------------- */


  //    Prime number------------------
  public static void main(String[] args) {
      int checkPrime=0, n=4;
      int num=0;
      num=n/2;
      if(n==1 || n==0){
          System.out.println(+n+" it is not prime number");
      }
      else {
          for(int i=2; i<num ; i++){
              if(n%i==0){
                  System.out.println(+n+" it  is not a prime number");
                  checkPrime=1;
                  break;
              }
      }

    if(checkPrime==0){
        System.out.println(+n+" it is a prime number");
    }
  }
}
}






