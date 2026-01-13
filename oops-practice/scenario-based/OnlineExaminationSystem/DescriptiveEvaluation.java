
import java.util.*;

public class DescriptiveEvaluation implements Evaluation {
    public int evaluate(List<Question> questions, Map<Question, String> answers) {
        return answers.size();
    }
}

