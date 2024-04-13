package com.company;

public class star {
   /*
    STAR IN ASCENDING ORDER



    static void strasdig(int star){
for (int i=1; i<=star; i++){

        switch(i){
               case 1:
                   System.out.println("*");
                   break;

               case 2:
                   System.out.println("**");
                   break;
               case 3:
                   System.out.println("***");
                   break;
               case 4:
                   System.out.println("****");
                   break;
               case 5:
                   System.out.println("*****");
                   break;
               case 6:
                   System.out.println("******");
                   break;

            }
        }
    }


    public static void main(String[] args) {

        strasdig(5);

    }

    */





    // DESCENDING ORDER



    static void stardsnding(int stard) {
int i=1;
    while(stard >= i){
        i++;
        switch (i) {
                case 1 -> System.out.println("******");
                case 2 -> System.out.println("*****");
                case 3 -> System.out.println("****");
                case 4 -> System.out.println("***");
                case 5 -> System.out.println("**");
                case 6 -> System.out.println("*");
            }
        }
    }

    public static void main(String[] args) {
        stardsnding(6);
    }
}