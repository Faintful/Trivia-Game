package net.faintful;

public class Strings {

    public Question[] questions;

    public Strings(Question... question) {
        this.questions = question;
    }

    public final String enter = "Please enter your answer:";

    public final String correct = "Correct!";
    public final String incorrect = "Incorrect!";

    public final String invalidInput = "Invalid input. Please enter either \"Yes\" or \"No\"";

    public final String correction = "The correct answer was ";

    public final String gameOver = "Game over!";

    public final String finalScore = "Your final score is: ";

}
