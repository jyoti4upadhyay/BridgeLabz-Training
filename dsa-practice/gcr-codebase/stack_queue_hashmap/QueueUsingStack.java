import java.util.*;
public class QueueUsingStack {
    Stack<Integer>stackIn=new Stack<>();
    Stack<Integer>stackOut=new Stack<>();

    public void enqueue(int x){
        stackIn.push(x);
    }

    public int dequeue(){
        if(stackOut.isEmpty()){
            while(!stackIn.isEmpty()){
                stackOut.push(stackIn.pop());
            }
        }
        if(stackOut.isEmpty()){
            throw new RuntimeException("Queue is empty!");
        }
        return stackOut.pop();
    }
    public static void main(String[] args){
        QueueUsingStack qs=new QueueUsingStack();
        qs.enqueue(5);
        qs.enqueue(8);
        qs.enqueue(10);
        System.out.println(qs.dequeue());
        System.out.println(qs.dequeue());
    }




}
