package com.company;

import java.util.Scanner;
public class Uni_tut4_q3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount: ");
        float currencyAmount = scanner.nextFloat();
        int x = (int) currencyAmount;
        int y = Math.round(100*(currencyAmount - x));

        if (y<10) {
            System.out.println("Amount printed European style: " + x + ",0" + y);
        }

        else {
            System.out.println("Amount printed European style: " + x + "," + y);
        }

    }
}
