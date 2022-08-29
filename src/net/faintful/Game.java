package net.faintful;

import java.util.Scanner;

public class Game {

    public Scanner scanner;
    public Prompter prompter;

    public int score = 0;
    public int questions;

    public Game(Prompter prompter, Scanner scanner) {
        this.prompter = prompter;
        this.scanner = scanner;
        this.questions = prompter.strings.questions.length;
    }

    public void scoreIncrement() {
            score++;
        }

    public String scan() {
        return scanner.next();
    }

    public boolean verifyAnswer(String input, int y) {
        return input.equals(prompter.strings.questions[y].answer);
    }

    public boolean validateCharacters(String input) {
        return input.equals("Yes") || input.equals("No");
    }

    public void start() {
        for (int k = 0; k < this.questions; k++){
            prompter.ask(prompter.strings.questions[k]);
            prompter.enter();
            String userInput = scan();
            if (validateCharacters(userInput)) {
                if (verifyAnswer(userInput, k)) {
                    prompter.correct();
                    scoreIncrement();
                } else {
                    prompter.incorrect();
                    prompter.correction(prompter.strings.questions[k].answer);
                }
            } else {
                prompter.invalidInput();
                k--;
            }
        }
        prompter.gameOver();
        prompter.finalScore(score, questions);
    }

}