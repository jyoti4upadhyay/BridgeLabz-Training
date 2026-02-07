import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class main {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of list");
        int size=sc.nextInt();
        System.out.println("Enter Your vesselDetails");
        List<Vessel> vesselList=new ArrayList<>();
        while(size>0){
            String val=sc.nextLine();
            String[] detail=val.split(":");
            Vessel v=new Vessel(detail[0],detail[1],detail[2],Double.parseDouble(detail[3]));
            vesselList.add(v);
            size--;
        }
        System.out.println("Enter the vesselId");
        double searchId=sc.nextDouble();

        VesselUtil ut=new VesselUtil(vesselList);
        Vessel valut=ut.getVesselById(searchId);

        if(valut!=null){
                System.out.println(valut.vesselId+"|"+valut.vesselName+"|"+valut.vesselType+"|"+valut.averageSpeed);
        }
        else{
            System.out.println("VesselId"+valut.averageSpeed+"not found");
        }
        System.out.println("High performance vessels are");
        List<Vessel> highPerformance=ut.getHighPerformanVessels();
        for(Vessel vessel:vesselList){
            System.out.println(vessel.vesselId+"|"+vessel.vesselName+"|"+vessel.vesselType+"|"+vessel.averageSpeed); 
        }
    }
    
}
