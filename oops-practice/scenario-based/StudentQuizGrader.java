public class StudentQuizGrader {
    public static int calculateScore(String[] correct,String[] student){
        int calScore=0;

        for (int i=0;i<10;i++){
            if(correct[i].equals(student[i])){
                System.out.println("Question:"+(i+1)+"correct");
                calScore++;
            }
            else{
                System.out.println("Question:"+(i+1)+"WrongAnswer");
            }

        }
        return calScore;
    }


    public static void main(String[] args){
          //Total Question 
        int totalques=10;
        String[] correctAns={"A","B","B","C","A","E","C","A","B","O"};
        String[] studentAns={"A","C","A","C","A","C","A","A","B","O"};
        int score=calculateScore(correctAns,studentAns);
        double percent=(score/10.0)*100;
        System.out.println("He got "+percent+"%"+" in exams");
        if(percent>60){
            System.out.println("Congrats! you got selected");
        }
        else{
            System.out.println("You are Fail");
        }
    }

}
