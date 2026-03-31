import java.util.*;
class Proctor {

    Stack<Integer> navigation =new Stack<>();
    HashMap<Integer, String> answer= new HashMap<>();

    HashMap<Integer, String> correctAns= new HashMap<>();

    
    Proctor() {
        correctAns.put(1, "A");
        correctAns.put(2, "C");
        correctAns.put(3, "B");
        correctAns.put(4, "D");
    }
    
    //Track navigation with stack.
    public void visitQues(int quesId) {
        navigation.push(quesId);
        System.out.println("Visited question is- " +quesId);
    }

    public void submitAns(int quesID, String ans) {
        answer.put(quesID, ans);
        System.out.println("Answer submitted for " + quesID + "- " + ans);
    }
    

    public int calScore() {
        int score = 0;
        for (Map.Entry<Integer, String> ety:answer.entrySet()) {
            int qID = ety.getKey();
            String givenAnswer = ety.getValue();
            String correctAnswer = correctAns.get(qID);

            if (givenAnswer.equals(correctAnswer)) {
                score++;
            }
        }
        return score;
    }
}


