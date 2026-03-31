public class PenDistribution {
    public static void main(String[] args) {
        int total_pen=14;
        int total_student=3;
        int distributed_qty=total_pen/total_student;
        int remaining_qty=total_pen%total_student;
        System.out.println("The pen per Student is "+distributed_qty+" and the remaining pen not distributed is "+remaining_qty);
    }
}
