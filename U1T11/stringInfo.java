package U1T11;
import java.util.Scanner;

class stringinfo {
    public static void main(String[] args) {
        Scanner noodle = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String word1 = noodle.nextLine();
        System.out.print("Enter second string: ");
        String word2 = noodle.nextLine();
        noodle.close();
        int len1 = word1.length();
        int len2 = word2.length();

        if (len1 > len2) {
            System.out.println(word1 + " is longer");
        } else {
            System.out.println(word2 + " is longer");
        }
        String half1 = word1.substring(0, len1/2);
        String half2 = word1.substring(len1/2);
        System.out.println("First half: " + half1);
        System.out.println("Second half: " + half2);
        half1 = word2.substring(0, len2/2);
        half2 = word2.substring(len2/2);
        System.out.println("First half: " + half1);
        System.out.println("Second half: " + half2);

    }
}