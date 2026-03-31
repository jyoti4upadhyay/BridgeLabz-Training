class Device{
    int deviceId;
    String status;

    Device(int deviceId,String status){
        this.deviceId=deviceId;
        this.status=status;
    }
}
class Thermostat extends Device{
    double temperatureSetting;
    
    Thermostat(int deviceId,String status,double temperatureSetting){
        super(deviceId,status);
        this.temperatureSetting=temperatureSetting;
    }
    void displayStatus(){
        System.out.println("DeviceId: "+deviceId);
        System.out.println("Status: "+status);
        System.out.println("temperatureSetting: "+temperatureSetting);
    }
}
public class SmarHomeDevice {
    public static void main(String[] args){
        Thermostat t=new Thermostat(0567,"Active",24.5);
        t.displayStatus();
    }
    
}
