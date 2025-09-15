import java.util.Scanner;

/* public class Problem1 {
    public static void main(String[] args) {
        Scanner noodle = new Scanner(System.in);
        System.out.print("Please enter your name ");
        String name = noodle.nextLine();
        System.out.println("Welcome! " + name);
        System.out.prints("Include your first number: ");
        int num1 = noodle.nextInt();
        
        System.out.print("Put in the second one! ");
        int num2 = noodle.nextInt();
        
        System.out.print("Put the third number! ");
        int num3 = noodle.nextInt();
        
        double medium = (num1 + num2 + num3) / 3.0;
        System.out.println("The average of " + num1 + ", "+ num2 + ", " + num3 + ", " + "is " + medium);
    }
    
} 
 */

/* public class Problem2 {
    public static void main(String[] args) {
        Scanner noodle = new Scanner(System.in);
        System.out.print("Player 1, enter your name! ");
        String name1 = noodle.nextLine();
        System.out.print("What is your score? ");
        double score1 = noodle.nextInt();
        System.out.print("Player 2, what is your next name? ");
        noodle.nextLine();
        String name2 = noodle.nextLine();
        System.out.print("What is your score? ");
        double score2 = noodle.nextInt();
        noodle.close();
        if (score1 > score2) {
            System.out.println(name1 + " Number's is greater!");

        } else if (score2 > score1) {
            System.out.print(name2 + " Number's is greater!");
        } else {
            System.out.println("The two numbers are equal!");
        }
    }
}
*/

public class U1T4 {
    public static void main(String[] agrs) {
        Scanner noodle = new Scanner(System.in);
        System.out.print("Please enter a 3 digit integer: ");
        int number = noodle.nextInt();
        int original = number;
        int char1 = number % 10;
        number = number - char1;
        int char2 = (number % 100) / 10;
        number = number - char2;
        int char3 = number / 100;
        noodle.close();
        System.out.println("The reverse of " + original + " is " + char1 + char2 + char3);
    }
}
