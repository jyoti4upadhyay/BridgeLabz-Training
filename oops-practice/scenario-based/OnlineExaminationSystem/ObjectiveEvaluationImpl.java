import java.util.*;

public class ObjectiveEvaluationImpl implements Evaluation {
    public int evaluate(List<Question> questions, Map<Question, String> answers) {
        int marks = 0;
        for (Question q : questions) {
            if (q.Objective() && q.getCorrectAns().equals(answers.get(q))) {
                marks++;
            }
        }
        return marks;
    }
}
