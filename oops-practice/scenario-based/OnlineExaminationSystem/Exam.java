import java.util.*;

public class Exam {
    private String examName;
    private List<Question> questions = new ArrayList<>();
    private long examDuration;

    public Exam(String examName, long duration) {
        this.examName = examName;
        this.examDuration =duration;
    }

    public void addQuestion(Question q) {
        questions.add(q);
    }

    public List<Question> getQuestions() {
        return questions;
    }

    public void checkTime() throws ExamTimeExpiredException {
        if (System.currentTimeMillis() > examDuration) {
            throw new ExamTimeExpiredException("Exam time expired!");
        }
    }
}
