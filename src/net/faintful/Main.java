package net.faintful;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {

        Question questionOne = new Question("Are traps gay?", "Yes");
        Question questionTwo = new Question("Is it gay to like traps?", "No");
        Question questionThree = new Question("Are you gay?", "Yes");
        Question questionFour = new Question("Did you like these questions?", "Yes");

        Strings strings = new Strings(questionOne, questionTwo, questionThree, questionFour);

        Prompter prompter = new Prompter(strings);
        Scanner scanner = new Scanner(System.in);

        Game game = new Game(prompter, scanner);

        game.start();

    }
}