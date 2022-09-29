package com.company;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Udemy_Section7 {


   /* (Exercise 1)
   public static void main(String[] args) {
        for (int i = 89; i<=117; i++){
            System.out.println(i);
        }
    }

    (Exercise 2)
    public static void main(String[] args) {
        int count = 1;

        for (int i = 1; i<=40; i++){
            System.out.println(i);

            if (count == 3){
            System.out.println("Quack");
            count = 0; //resets the count back to  rather than adding 3 each time to previous value
        }
            count++;;
        }
    }

    (Exercise 3)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String password;

        do {
            System.out.println("Please enter the password: ");
            password = scanner.next();

        } while (!password.equals("shark50"));
            System.out.println("ACCESS APPROVED");
    }

    (Exercise 4)
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++){
            System.out.print(i + ", ");
        }
        System.out.print("\b\b.");
    } */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int guess;
        int randomNumber = ThreadLocalRandom.current().nextInt(1, 101);
        int count = 0;

        do {
            System.out.println("Guess the number: ");
            guess = scanner.nextInt();
            count++; //better to put the count++ here rather than add it as another if statement as this way is more concise.

            if (guess > randomNumber) {
                System.out.println("Lower");
            } else if (guess < randomNumber) {
                System.out.println("Higher");
            } else {
                System.out.println("Correct!");
                System.out.println("It took you " + count + " attempt(s).");
            }
        } while (guess != randomNumber);
    }
}