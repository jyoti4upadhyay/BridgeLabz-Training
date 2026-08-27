import java.util.*;

class TeamStrengthSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        List<Integer> strength=new ArrayList<>();
        int size=sc.nextInt();
        List<Integer> teamSize=new ArrayList<>();
        for(int i=0;i<num;i++){
            strength.add(sc.nextInt());
        }
        int sum=0;
        for(int i=0;i<size;i++){
            teamSize.add(sc.nextInt());
            sum=sum+teamSize.get(i);
        }

        if(sum!=num){
            System.out.println("NotValid");
        }
        else{
            Collections.sort(teamSize);
            Collections.sort(strength,Collections.reverseOrder());
            int total=0;
            int index=0;
            for(int i=0;i<teamSize.size();i++){
                List<Integer>ls=new ArrayList<>();
                for(int j=0;j<teamSize.get(i);j++){
                    ls.add(strength.get(index));
                    index++;
                }
                int st=ls.get(0)+ls.get(ls.size()-1);
                total=total+st;
            }
            System.out.println(total);
        }
        
    }

}