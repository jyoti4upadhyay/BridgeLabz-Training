public class Main {
	public static void main(String[] args) {
        Proctor proctor =new Proctor();

        proctor.visitQues(1);
        proctor.submitAns(1, "A");

        proctor.visitQues(2);
        proctor.submitAns(2, "D");+

        proctor.visitQues(3);
        proctor.submitAns(3, "C");

        proctor.visitQues(4);
        proctor.submitAns(4, "D");

        int finalScore =proctor.calScore();
        System.out.println("Final score is-" + finalScore+"/" + 4);
    }
}