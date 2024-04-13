package com.company;

public class practi {
    /*static int  table (int tn){   -----------------------------------------------------1st ans----------
      for (int i=1; i<=10; i++){
          int result=tn*i;
          System.out.println(+tn+"*"+i+"="+result);
      }
      return tn;
    }
    public static void main(String[] args) {
        table(2);
    } ====================================================================================================*/


   /*static void  natural(int natu){----------------------------------------- wrong coding---------------------
       int i;
       for ( i=0; i<=natu; i++ ) {
          //int sum = --i;
           int result = sum + i;
           System.out.println("the sum of natural number is " + result);
       }
   }
   public static void main(String[] args) {
        natural(1);
    }=============================================================================================/**/

    public static void star(int str) {
        switch (str) {
            case 5:
                System.out.println("*****");
            case 4:
                System.out.println("****");
            case 3:
                System.out.println("***");

            case 2:
                System.out.println("**");

            case 1:
                System.out.println("*");
                break;
        }

    }
    public static void main(String[] args) {
        star(5   );
        

    }






}
