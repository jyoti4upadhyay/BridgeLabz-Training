public class Question {
    private String question;
    private String correctAns;
    private boolean Objective;

    public Question(String question, String correctAns, boolean Objective) {
        this.question = question;
        this.correctAns = correctAns;
        this.Objective = Objective;
    }

    public String getCorrectAns() {
        return correctAns;
    }

    public boolean Objective() {
        return Objective;
    }
}

