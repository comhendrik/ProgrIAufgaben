package quiz;

import java.util.ArrayList;

public class QuizGame {
    private int currentScore;

    private int currentRound;

    private ArrayList<Question> questionArrayList;

    public QuizGame() {
        this.currentRound = this.currentScore = 0;
        questionArrayList = new ArrayList<>();
        initQuestions();
    }

    private void initQuestions() {
        //API Call to API to get random questions, but my implementation to this moment will be static
        questionArrayList.add(new MultipleChoiceQuestion("What is this", 5, "String answer1", "String answer2", "String answer3", "String answer4", 0));
        questionArrayList.add(new BooleanQuestion("What is this boolean question?", 3, false));
    }

    public void play() {
        System.out.println("Welcome to this new game! You will be asked true or false and multiple choice questions");
        for (Question q : questionArrayList) {
            System.out.println("Current Round: " + currentRound);
            if(q.answerQuestion()) {
                System.out.println("Congrats! Right Answer");
                currentScore += q.getPoints();
            } else {
                System.out.println("Not the right answer don't give up");
                System.out.println(q.getRightAnswer());
            }
            System.out.println("Score: " + currentScore);
            currentRound += 1;
        }
        System.out.println("Thanks for playing. Your score was: " + currentScore);
    }

}
