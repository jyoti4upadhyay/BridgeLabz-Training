import java.util.*;
class CreatorStats{
    String creatorName;
    List<Double>weeklyLikes=new ArrayList<>();

    CreatorStats(String creatorName,List<Double>weeklyLikes){
        this.creatorName=creatorName;
        this.weeklyLikes=weeklyLikes;

    }
}

class Program{
    public static List<CreatorStats>records=new ArrayList<>();
    public void registerCreator(CreatorStats record){
        records.add(record);
        System.out.println("Registered Sucessfully");
    }
    public HashMap<String ,Integer>getTopPostCount(double threshold){
        HashMap<String,Integer>hs=new HashMap<String ,Integer>();
        for(int i=0;i<records.size();i++){
            int count=0;
            for(int j=0;j<records.get(i).weeklyLikes.size();j++){
                if(records.get(i).weeklyLikes.get(j)>=threshold){
                    count++;
                }
            }
            if(count>0){
            hs.put(records.get(i).creatorName,count);
            }
        }
        return hs;
    }

    public double calculateAverageLikes(){
        double sum=0;
        int count=0;
        for(int i=0;i<records.size();i++){
            for(int j=0;j<records.get(i).weeklyLikes .size();j++){
                sum=sum+records.get(i).weeklyLikes.get(j);
                count++;
            }
        }
        double avg=sum/count;
        return avg;

    }
}
public class SteamBuzz{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Program program =new Program();
            while(true){
            System.out.println("1 Register Creator");
            System.out.println("2 Show Top posts");
            System.out.println("3 Calculate Average Likes");
            System.out.println("4 Exit");

            System.out.println("Enter number");
            int num=sc.nextInt();

            switch(num){
            
                case 1:
                    String name=sc.next();
                    List<Double>likes=new ArrayList<>();
                    
                    for(int i=0;i<4;i++){
                        double n=sc.nextDouble();
                        likes.add(n);
                    }
                    CreatorStats record=new CreatorStats(name,likes);
                    program.registerCreator(record);
                    break;
                case 2:
                    System.out.println("Enter like threshold");
                    double threshold=sc.nextDouble();
                    HashMap<String,Integer>res=program.getTopPostCount(threshold);
                    for(String key:res.keySet()){
                        System.out.println(key+" "+res.get(key));
                    }
                    break;
                
                case 3:
                    double avg=program.calculateAverageLikes();
                    System.out.println(avg);
                    break;
                case 4:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid Choice");
                    break;
            } 
        }

    }
}