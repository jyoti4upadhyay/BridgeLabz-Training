import java.util.Random;
import java.util.Scanner;

public class SnakeLadderGame {
    // 1 player
    //UC2
    public int dieRolls(){
        Random rand=new Random();
        int num=rand.nextInt(6)+1;
        return num;
    }
    // UC3
    public int PlayerCheck(int dienum,int position){
        Random rnd=new Random();
        int option=rnd.nextInt(3);//0,1.2
        int pos=position;

        switch (option) {
            case 0: //no play
                pos=pos+0;
                break;
            case 1://ladder
                pos=pos+dienum;
                break;
            case 2: //snake;
                pos=pos-dienum;
                break;
                
        }
        if(pos<0){
            pos=0;
        }
        if(pos >100){
            pos=position;
        }
        return pos;
    }

    public static void main(String[] args) {
        //Start
        System.out.println("Start");
        Scanner sc=new Scanner(System.in);
        SnakeLadderGame sl=new SnakeLadderGame();
        System.out.println("Enter 1 for single player/2 for double player");
        int user=sc.nextInt();

        switch(user){
            case 1:
                int position=0; 
                int diecount=0;
                while(position!=100){//UC4
                    diecount++;
                    int die_num=sl.dieRolls();
                    position=sl.PlayerCheck(die_num,position);
                }
                System.out.println("TotalCount of Dice "+diecount);
                if(position==100){ //UC5
                    System.out.println("Hurray!! You win the Match");

                }
                else if(position<0){
                    System.out.println("Restart this match"); //UC6
                    position=0;
                    while(position<100){
                        diecount++;
                        int die_num=sl.dieRolls();
                        position=sl.PlayerCheck(die_num,position);
                    }
                }
                break;
            case 2:  //UC7
                int user1position=0;
                int user2position=0;
                int diecounts=0;
                boolean user1=true;
                while(user1position!=100 && user2position!=100){
                    diecounts++;
                    if(user1){
                        int die_num_User1=sl.dieRolls();
                        user1position=sl.PlayerCheck(die_num_User1,user1position);
                        user1=false;

                    }
                    else{
                        int die_num_User2=sl.dieRolls();
                        user2position=sl.PlayerCheck(die_num_User2,user2position);
                        user1=true;
                    }
                }
                System.out.println("Total DiceCount of user "+diecounts);
                

                if(user1position==100){
                    System.out.println("Hurray!! User1 win the Match");
                }
                else{
                    System.out.println("Hurray!! User2 win the Match");
                }
                break;
        }
    }

}
  
