package quiz;

import Prog1Tools.IOTools;

public class BooleanQuestion extends Question {

    private boolean correctAnswer;

    public BooleanQuestion(String question, int points, boolean correctAnswer) {
        super(question,points);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public boolean answerQuestion() {
        System.out.println("True or false?: " + getQuestion());
        boolean answer = IOTools.readBoolean("What is your answer? ");
        return correctAnswer == answer;
    }

    @Override
    public String getRightAnswer() {
        return correctAnswer ? "The answer is true" : "The answer is false";
    }
}
