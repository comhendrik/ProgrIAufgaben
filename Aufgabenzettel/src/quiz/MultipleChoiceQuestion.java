package quiz;

import Prog1Tools.IOTools;

public class MultipleChoiceQuestion extends Question{
    private String[] answers;

    private int correctAnswerIndex;

    public MultipleChoiceQuestion(String question, int points, String answer1, String answer2, String answer3, String answer4, int correctAnswerIndex) {
        super(question, points);
        if(correctAnswerIndex < 0 || correctAnswerIndex > 3) throw new IllegalArgumentException("Index of correct answer must be in between of 0 and 3. Yours is " + correctAnswerIndex);
        this.correctAnswerIndex = correctAnswerIndex;
        answers = new String[]{answer1,answer2,answer3,answer4};
    }

    @Override
    public boolean answerQuestion() {
        System.out.println("Question: " + getQuestion());
        for (int i=0; i<4; i++) {
            System.out.println("Answer " + i + ": " + this.answers[0]);
        }
        int answerIndex = IOTools.readInt("What is your answer? ");
        return correctAnswerIndex == answerIndex;
    }

    @Override
    public String getRightAnswer() {
        return answers[correctAnswerIndex];
    }
}
