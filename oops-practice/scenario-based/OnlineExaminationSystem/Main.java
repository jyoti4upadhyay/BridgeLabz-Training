import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student = new Student(28, "Jyoti");

        Exam exam = new Exam("MATHS TEST", 5000);
        Question ques1 = new Question("2+56", "58",true);
        Question ques2 = new Question("x+y=28,where y=5 what is the value of x", "23", false);

        exam.addQuestion(ques1);
        exam.addQuestion(ques2);

        Map<Question, String> answers = new HashMap<>();

        try {
            exam.checkTime();

            answers.put(ques1, "2+56");
            answers.put(ques2, "x+y=28,where y=5 what is the value of x");

            Evaluation obj= new ObjectiveEvaluationImpl();
            Evaluation des = new DescriptiveEvaluation();

            int totalMarks = obj.evaluate(exam.getQuestions(), answers)
                        + des.evaluate(exam.getQuestions(), answers);

            System.out.println(student.getName() + " scored: " + totalMarks);

        } catch (ExamTimeExpiredException e) {
            System.out.println(e.getMessage());
        }
    }
}

