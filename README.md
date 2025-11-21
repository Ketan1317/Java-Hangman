💀 Java Hangman ☕

A simple terminal-based Hangman game written in Java.
Guess letters, avoid mistakes, and save the stickman before it's too late!

🎯 Features

✔ Terminal-based user interface

✔ Random word selection (optional via words.txt)

✔ ASCII hangman art

✔ Input validation (only letters allowed)

✔ Case-insensitive guesses

📖 How It Works

The game randomly selects a word from the provided list (or words.txt if available).

The player guesses letters one at a time.

Each wrong guess progresses the ASCII hangman drawing.

The goal is to guess the entire word before the hangman is fully drawn.

🚀 How to Run

Clone the repository or download the project folder.

Navigate to the src directory and compile the Java file:

javac Main.java


Run the game:

java Main

📝 Optional: Add Random Words

You can add a words.txt file in the root directory with one word per line, for example:

pizza
java
mango
hangman
keyboard
developer
