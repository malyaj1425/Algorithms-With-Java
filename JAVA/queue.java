import java.util.*;

class Equeue
{
    private int data[]=new int[5];
    private int f,r;
    private int i;
    private int del;
    Equeue()
    {
        f=0;
        r=-1;
    }
    public void enqueue(int x){
        if(r==4){
            System.out.println("Overflow!");
        }
        else{
            r++;
            data[r]=x;
        }
    }
    public void dequeue(){
        if(r==-1){
            System.out.println("Underflow");
        }
        else{
            del=data[f];
            f++;
        }
    }
    public void display(){
        i=f;
        while(i<5){
            System.out.print(data[i]+" ");
            i++;
        }
    }
}
public class queue {
    public static void main(String[] args) {
        Equeue A=new Equeue();
        A.enqueue(1);
        A.enqueue(2);
        A.enqueue(3);
        A.enqueue(4);
        A.enqueue(5);
        A.dequeue();
        A.enqueue(6);

        A.display();
    }
}
