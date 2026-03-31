// single LinkedList
public class StudentRecord {
    static class Node{
        int rollNumber,age;
        String grade,name;
        Node next;

        Node(int rollNumber,String name,int age,String grade){
            this.rollNumber=rollNumber;
            this.age=age;
            this.name=name;
            this.grade=grade;
            this.next=null;
        }
    }

    Node head=null;
    //Add node at beginning
    void addAtBeginning(int rollnum,String name,int age,String grade){
        Node newnode=new Node(rollnum,name,age, grade);
        newnode.next=head;
        head=newnode;
    }

    //Add node at Last
    void addAtLast(int rollnum,String name,int age,String grade){
        Node newnode=new Node(rollnum, name, age, grade);
        if(head==null){
            head=newnode;
            return;
        }
        Node temp=head;
        while(temp.next!=null){
            temp=temp.next;
        }
        temp.next=newnode;
    }

    //Add node at position 

    void AddAtPosition(int pos,int roll,String name,int age,String grade){
        if(pos==0){
            addAtBeginning(roll, name, age, grade);
            return;
        }
        Node newnode=new Node(roll, name, age, grade);
        Node temp=head;
        for(int i=1;i<pos && temp!=null;i++){
            temp=temp.next;
        }
        if(temp==null){
            return;
        }
        newnode.next=temp.next;
        temp.next=newnode;
    }

    //delete record by roll number

    void deleteByRollNumber(int roll){
        if(head==null) return;
        if(head.rollNumber==roll){
            head=head.next;
            return;
        }
        Node temp=head;
        while(temp.next!=null && temp.next.rollNumber!=roll){
            temp=temp.next;
        }
        if(temp.next==null){
            return;
        }
        temp.next=temp.next.next;
    }

    void updateGrade(int rollnum,String newGrade){
        Node temp=head;
        while(temp!=head){
            if(temp.rollNumber==rollnum){
                temp.grade=newGrade;
                return;
            }
            temp=temp.next;
        }

    }
    
    void searchByRollNum(int rollnum){
        Node temp=head;
        while(temp!=null){
            if(temp.rollNumber==rollnum){
                System.out.println("Found: "+temp.name+"Grade: "+temp.grade);
                return;
            }
            temp=temp.next;
        }
        System.out.println("Student Not Found");
    }
    void displayStudent(){
        Node temp=head;
        while(temp!=null){
            System.out.println(temp.rollNumber+" "+temp.name+" "+temp.grade+" "+temp.age);
            temp=temp.next;
        }
    }
    public static void main(String[] args){
        StudentRecord std=new StudentRecord();
        std.addAtBeginning(1,"Jyoti",21,"A");
        std.addAtLast(78,"Ram", 21,"C");
        std.AddAtPosition(5,6, "Bob", 14,"B");
        std.updateGrade(6, "B");
        std.searchByRollNum(1);
        std.deleteByRollNumber(6);
        std.displayStudent();
        
    }   
}
