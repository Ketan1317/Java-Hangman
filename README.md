💀 Java Hangman ☕

A simple terminal-based Hangman game written in Java.
Guess letters, avoid mistakes, and save the stickman before it's too late!

Word: _ _ _ _ _
Guess a letter: >

As you guess incorrectly, the hangman drawing progresses:

+---+
 |   |
 O   |
/|\  |
/ \  |
     |
=========


Your mission: guess the entire word before the drawing completes.

✨ Features

✔ Terminal UI
✔ Random word support (optional via words.txt)
✔ ASCII hangman art
✔ Input validation
✔ Case-insensitive character handling

📁 Project Structure
JavaHangman/
│
├── src/
│   └── Main.java
│
└── words.txt  (optional random word file)

🚀 How to Run

Clone the repository or copy the project folder.

Compile the Java file:

javac Main.java


Run the game:

java Main

📌 Optional: Add Random Words

Create a words.txt file and add words (one per line):

pizza
java
mango
hangman
keyboard
developer


The game can then pick a random word each time.

🛠️ Technologies Used

Java 8+

ASCII art

CLI interaction using Scanner

🧪 Example Gameplay
Word: _ _ _ _ _
Guess: a
Correct Guess!

Word: _ a _ _ _
Guess: z
Wrong Guess!

+---+
|   |
O   |
|   |
    |
    |
=========

🎯 Future Improvements

🟦 Color support (green = correct, red = wrong)

🎵 Sound effects

🧠 Difficulty levels

🎲 Random word API

🏆 Score tracking

📜 License

This project is open-source and free to use.
