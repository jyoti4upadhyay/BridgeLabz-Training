public class WatchSimulation {
    public static void main(String[] args) {
        for(int hour=0;hour<=24;hour++){
            for(int minute=0;minute<=60;minute++){
                if(hour==13 && minute==0){
                    System.out.println("PowerCut at 13:00");
                    break;
                }
                if(hour<10){
                    System.out.print("0"+hour+":");
                }
                else{
                    System.out.print(hour+":");
                }
                if(minute<10){
                    System.out.println("0"+minute);
                }
                else{
                    System.out.println(minute);
                }

            }

        }
    }
    
}
