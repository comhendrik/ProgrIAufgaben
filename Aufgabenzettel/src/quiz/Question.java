package quiz;

public abstract class Question {
    private String question;

    private final int points;

    public Question(String question, int points) {
        if (points <= 0) throw new IllegalArgumentException(points + " is not allowed for points in a question");
        this.question = question;
        this.points = points;
    }

    public String getQuestion() {
        return question;
    }

    public int getPoints() {
        return points;
    }

    public abstract boolean answerQuestion();

    public abstract String getRightAnswer();
}
