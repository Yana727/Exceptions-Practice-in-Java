package com.company;


import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("\n****\nI'm done!!!\n****\n");
        divideInts(6,3);
        divideInts(4,0);
        getSafeInt();
        sumOfNumbers();
    }
    public static int divideInts (int a, int b) {
          try {  //running the function
              return a/b;
          } catch(ArithmeticException ex) { //if something goes wrong
              System.out.println("Ooops, " + ex.getMessage());
              return 0;
        }
    }

    public static int getSafeInt () {
         try { //running this
           return Integer.parseInt(new Scanner(System.in).nextLine());
         } catch(NumberFormatException e){ //if they enter not integer
             System.out.println("You are not using an integer!");
             return getSafeInt();
         }
    }


    public static int sumOfNumbers (int[] numbers, int length) {
        int total = 0;
        for (int num : numbers) {
            total += num;}
        try { //returning total
            return total;
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("oh, no!" + e.getLocalizedMessage());
            return 0;
        }
        }

    }


