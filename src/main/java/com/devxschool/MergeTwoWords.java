package com.devxschool;

import java.util.Scanner;

public class MergeTwoWords {

    public static void main(String[] args) {
        /**
         * Merge two words with three characters one by one and print them
         * if words have more than three characters print Error message "Incorrect input! Cannot merge".
         *
         * ex
         * "ice", "sea"
         *
         *
         * output:
         * isceea
         *
         * ex2:
         * "Hot", "Day"
         *
         * output:
         * HDoaty
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your first three letter word: ");
        String word1 = sc.nextLine().toLowerCase();
        System.out.println("Enter your second three letter word: ");
        String word2 = sc.nextLine().toLowerCase();

        System.out.println("Merging words: " + word1 + ", " + word2);

        if (word1.length() > 3 || word2.length() > 3) {
            System.out.println("Incorrect input! Cannot merge");
        } else {
            System.out.println(printMerge(word1, word2));
        }

    }

    public static String printMerge(String word1, String word2) {
        //TODO IMPLEMENT METHOD

        String combined = "";

        int length = Math.max(word1.length(), word2.length());
        for (int i = 0; i < length; i++) {
            if (word1.length() > i || word2.length() > i) {
                combined = combined + word1.charAt(i) + word2.charAt(i);
            }
        }
        return combined;


    }


}









