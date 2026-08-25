import java.util.*;

class Vessel{
    private String vesselId;
    private String vesselName;
    private double averageSpeed;
    private String vesselType;
    Vessel(String vesselId,String vesselName,double averageSpeed,String vesselType){
        this.vesselId=vesselId;
        this.vesselName=vesselName;
        this.averageSpeed=averageSpeed;
        this.vesselType=vesselType;
    }
    public void setVesselId(String vesselId){this.vesselId=vesselId;}
    public void setVesselName(String vesselName){this.vesselName=vesselName;}
    public void setAverageSpeed(double averageSpeed){this.averageSpeed=averageSpeed;}
    public void setVesselType(String vesselType){this.vesselType=vesselType;}
    public String getVesselId(){return vesselId;}
    public String getVesselName(){return vesselName;}
    public double getaverageSpeed(){return averageSpeed;}
    public String getVesselType(){return vesselType;}
}

class VesselUtil{
    private List<Vessel>vesselList=new ArrayList<>();

    public List<Vessel> getVesselList(){
        return vesselList;
    }

    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
    public Vessel getVesselById(String vesselId){
        for(int i=0;i<vesselList.size();i++){
            String str=vesselList.get(i).getVesselId();
            if(str.equalsIgnoreCase(vesselId)){
                return vesselList.get(i);
            }
        }
        return null;
    }

    public List<Vessel> getHighPerformanceVessels(){
        List<Vessel> ls=new ArrayList<>();
        double max=Double.NEGATIVE_INFINITY;
        for(int i=0;i<vesselList.size();i++){
            if(max<vesselList.get(i).getaverageSpeed()){
                max=vesselList.get(i).getaverageSpeed();
            }
        }
        for(int i=0;i<vesselList.size();i++){
            if(max==vesselList.get(i).getaverageSpeed()){
                ls.add(vesselList.get(i));
            }
        }
        return ls;
    }
    public void display(Vessel vessel){
        System.out.println(vessel.getVesselId()+"|"+vessel.getVesselName()+"|"+vessel.getaverageSpeed()+"|"+vessel.getVesselType());
    }
}

public class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of vessel");
        int num=sc.nextInt();
        System.out.println("Enter Vessel Details");
        VesselUtil vu=new VesselUtil();
        sc.nextLine();
        int i=0;
        while(i<num){
            String str=sc.nextLine();
            String[] arr=str.split(":");
            String id=arr[0];
            String name=arr[1];
            double averageSpeed=Double.parseDouble(arr[2]);
            String vesselType=arr[3];
            Vessel vessel=new Vessel(id,name,averageSpeed,vesselType);
            vu.addVesselPerformance(vessel);
            i++;
        }

        System.out.println("Enter vessel Id");
        String vesselId=sc.next();
        Vessel res=vu.getVesselById(vesselId);
        if(res==null){
            System.out.println("Vessel Id "+vesselId+" not found");
        }
        else{
        vu.display(res);
        }
        //high performance
        List<Vessel>result=vu.getHighPerformanceVessels();
        for(int k=0;k<result.size();k++){
            System.out.println(result.get(k).getVesselId()+"|"+result.get(k).getVesselName()+"|"+result.get(k).getaverageSpeed()+"|"+result.get(k).getVesselType());

        }




    }
}


