
import java.util.Scanner;

public class is_vowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a letter: ");
        char letter = scanner.next().charAt(0); // Read the letter from the keyboard

        if (letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u' ||
                letter == 'A' || letter == 'E' || letter == 'I' || letter == 'O' || letter == 'U') {
            System.out.println("The letter is a vowel.");
        } else {
            System.out.println("The letter is not a vowel.");
        }
    }
}
