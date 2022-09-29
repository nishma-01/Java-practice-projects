package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Udemy_Section8 {

   /*  public static void main(String[] args) {
      int [] a = {33, 42, 67, 4, 398, 76, 294, 102, 9362, 11};
      for (int i = 0; i<a.length; i++){ //better to use.length method by why do we hae to define elements using int a = = new int[10]??
          System.out.println(a[i]);
      }
    }

    public static void main(String[] args) {
        for (int i = 1; i<=20; i++){
            System.out.println(i);
        }
        for (int i = 20; i>=1; i--){
            System.out.println(i);
        }
    }

    public static void main(String[] args) {
        double[] num = new double[5];
        num[0] = 56.98;
        num[1] = 347.51;
        num[2] = 84.55;
        num[3] = 12.07;
        num[4] = 36.80;
        double sumOfNums = 0; // this is defined outside the loop as it is needed within the whole code. Defined as 0 so that the sum of the numbers starts at 0.

        for (int i = 0; i < num.length; i++) {
            sumOfNums += num[i]; //need to understand this function and why not sumOfNums = sumOfNums + nums [i]??

        }
            double mean = sumOfNums / num.length;

            System.out.println("Sum: " + sumOfNums);
            System.out.println("Mean: " + mean);

    }*/

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter your top five foods: ");

        String[] food = new String[5];

        String foodOne = scanner.nextLine();
        String foodTwo = scanner.nextLine();
        String foodThree = scanner.nextLine();
        String foodFour = scanner.nextLine();
        String foodFive = scanner.nextLine();

        food[0] = foodOne;
        food[1] = foodTwo;
        food[2] = foodThree;
        food[3] = foodFour;
        food[4] = foodFive;

        for (int i = 0; i < food.length; i++) {
            String e = food[i];

            System.out.println(e);
        }


    }
    }