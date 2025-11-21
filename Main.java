import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String filePath = "words.txt";
        ArrayList<String> words = new ArrayList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                words.add(line.trim());
            }

        } catch (FileNotFoundException e) {
            System.out.println("Could Not found the file");
        } catch (IOException e) {
            System.out.println("Something Went Wrong!");
        }

        Random random = new Random();

        String word = words.get(random.nextInt(words.size()));

        Scanner sc = new Scanner(System.in);
        ArrayList<Character> wordState = new ArrayList<>();
        int wrongGuesses = 0;

        for (int i = 0; i < word.length(); i++) {
            wordState.add('_');
        }

        System.out.println("***************************");
        System.out.println("Welcome To The Java Hangman");
        System.out.println("***************************");

        while (wrongGuesses < 6 && wordState.contains('_')) {
            System.out.println(getHangmanArt(wrongGuesses));

            System.out.print("\nWord: ");
            for (char c : wordState) {
                System.out.print(c + " ");
            }

            System.out.print("\nEnter a letter: ");
            char guess = sc.next().toLowerCase().charAt(0);

            boolean ifGuessCorrect = false;

            for (int i = 0; i < word.length(); i++) {
                if (guess == word.charAt(i) && wordState.get(i) == '_') {
                    wordState.set(i, guess);
                    ifGuessCorrect = true;
                }
            }

            if (ifGuessCorrect) {
                System.out.println("\nCorrect Guess!\n");
            } else {
                wrongGuesses++;
                System.out.println("\nWrong Guess! (" + wrongGuesses + "/6)\n");
            }
        }

        System.out.println(getHangmanArt(wrongGuesses));

        if (!wordState.contains('_')) {
            System.out.println("\n Yoohoooooo!!! YOU WIN! The word was: " + word);
        } else {
            System.out.println("\n Ohh Shitttt!!! GAME OVER! The word was: " + word);
        }

        sc.close();
    }

    static String getHangmanArt(int wrongGuesses) {
        return switch (wrongGuesses) {
            case 0 -> """
                     +---+
                     |   |
                         |
                         |
                         |
                         |
                    =========
                    """;

            case 1 -> """
                     +---+
                     |   |
                     O   |
                         |
                         |
                         |
                    =========
                    """;

            case 2 -> """
                     +---+
                     |   |
                     O   |
                     |   |
                         |
                         |
                    =========
                    """;

            case 3 -> """
                     +---+
                     |   |
                     O   |
                    /|   |
                         |
                         |
                    =========
                    """;

            case 4 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                         |
                         |
                    =========
                    """;

            case 5 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    /    |
                         |
                    =========
                    """;

            case 6 -> """
                     +---+
                     |   |
                     O   |
                    /|\\  |
                    / \\  |
                         |
                    =========
                    """;

            default -> "Invalid";
        };
    }

}
