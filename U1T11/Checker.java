package U1T11;
import java.util.Scanner;


public class Checker {
    public static void main(String[] args) {
        Scanner noodle = new Scanner(System.in);
        System.out.print("Enter string 1: ");
        String word1 = noodle.nextLine();
        System.out.print("Enter string 2: ");
        String word2 = noodle.nextLine();
        int comparision = word1.compareTo(word2);
        noodle.close();
        if (word1.length() == word2.length()) {
            System.out.println("The strings are equal");
        } else {
            System.out.println("The strings are NOT equal");
            if (comparision > 0) {
                System.out.println(word2 + " comes before " + word1 + " alphabetically."); 
            } else {
                System.out.println(word1 + " comes before " + word2 + " alphabetically.");
            }
        }
    }
}
