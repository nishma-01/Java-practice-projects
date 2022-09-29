package com.company;

import java.util.Scanner;

public class UNI_TUT12_Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a word: ");
        String word2 = scanner.nextLine();

        task2(word2);
        System.out.println("The reverse of " + word2 +
                " is: " + task2(word2));

    }

    public static String task2 (String word2) {
        String reverseWord = "";

        for (int i = word2.length() -1; i >= 0; i--) {
            reverseWord = reverseWord + word2.charAt(i);
        }
        return reverseWord;
    }

}
