package net.faintful;

public class Prompter {

    Strings strings;

    public Prompter(Strings strings) {
        this.strings = strings;
    }

    public void ask(Question question) {
        System.out.println("\n" + question.question + "\n");
    }

    public void enter() {
        System.out.println(strings.enter);
    }

    public void correct() {
        System.out.println(strings.correct);
    }

    public void incorrect() {
        System.out.println(strings.incorrect);
    }

    public void correction(String answer) {
        System.out.println(strings.correction + "\"" + answer + "\"");
    }

    public void invalidInput() {
        System.out.println(strings.invalidInput);
    }

    public void gameOver() {
        System.out.println("\n" + strings.gameOver);
    }

    public void finalScore(int yourScore, int topScore) {
        System.out.println("\n" + strings.finalScore + yourScore + " out of " + topScore);
    }

}