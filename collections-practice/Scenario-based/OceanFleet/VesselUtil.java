import java.util.ArrayList;
import java.util.List;
public class VesselUtil  {
    public VesselUtil(List<Vessel> vesselList){
        this.vesselList=vesselList;
    }
    private List<Vessel> vesselList;

    public List<Vessel> getVesselList(){
        return vesselList;
    }
    public void setVesselList(List<Vessel> vesselList){
        this.vesselList=vesselList;
    }
    public void addVesselPerformance(Vessel vessel){
        vesselList.add(vessel);
    }
    public Vessel getVesselById(double vesselId){
        for(Vessel vessel:vesselList){
            if(vessel.vesselId.equals(vesselId)){
                return  vessel;
            }
        }
        return null;
    }

    public List<Vessel>getHighPerformanVessels(){
        List<Vessel> result=new ArrayList<>();
        double maxSpeed=vesselList.get(0).averageSpeed;
        for(Vessel vessel:vesselList){
            if(vessel.averageSpeed>maxSpeed){
                maxSpeed=vessel.averageSpeed;
            }
        }
        for(Vessel vessel:vesselList){
            if(vessel.averageSpeed == maxSpeed){
                result.add(vessel);
            }
        }
        return null;
    }

    
}
