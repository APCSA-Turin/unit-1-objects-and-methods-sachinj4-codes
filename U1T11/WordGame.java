package U1T11;

import java.util.Scanner;
public class WordGame {
    public static void main(String[] args) {
        Scanner noodle = new Scanner(System.in);
        int points = 0;
        int wordCount = 0;
        System.out.print("Enter your first word: ");
        String word1 = noodle.nextLine();
        System.out.print("Enter your next word: ");
        String word2 = noodle.nextLine();

        if (word2.compareTo(word1) > 0) {
            points += 2;
            System.out.println("Word comes alphabetically after previous word, +2 points");
        } else if (word2.compareTo(word1) < 0) {
            points -= 5;
            System.out.println("Word comes alphabetically before preivous word, -5 points");
        } else if (word2.compareTo(word1) == 0) {
            points -= 10;
            System.out.println("Words are equal, -10 points");
        }

        if (word1.substring((word1.length()-2)).equals(word2.substring(0,2))) {
            points += 5;
            System.out.println("First two letters of previous word matches up wtih last two letters of current word. +5 points.");
        }
        if (word2.contains(word1.substring(0,1))) {
            points += 3;
            System.out.println("First letter of preivous word found in current word. +3 points");
        }
        word1 = word2;

        while (points < 50) {
            System.out.print("Enter your next word: ");
            word2 = noodle.nextLine();
            if (word2.compareTo(word1) > 0) {
            points += 2;
            System.out.println("Word comes alphabetically after previous word, +2 points");
            } else if (word2.compareTo(word1) < 0) {
                points -= 5;
                System.out.println("Word comes alphabetically before preivous word, -5 points");
            } else if (word2.compareTo(word1) == 0) {
                points -= 10;
                System.out.println("Words are equal, -10 points");
            }

            if (word1.substring((word1.length()-2)).equals(word2.substring(0,2))) {
                points += 5;
                System.out.println("First two letters of previous word matches up wtih last two letters of current word. +5 points.");
             }
            
            if (word2.contains(word1.substring(0,1))) {
                points += 3;
                System.out.println("First letter of preivous word found in current word. +3 points");
            }
            word1 = word2;
        }
        noodle.close();
    }
}