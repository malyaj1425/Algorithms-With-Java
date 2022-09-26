import java.lang.Math;
import java.util.Scanner;

class Complex{
    private int real;
    private int img;
    public void input(){
        System.out.println("Enter Value");
        Scanner sc=new Scanner(System.in);
        real=sc.nextInt();
        img=sc.nextInt();
    }
    public void display(){

    }
    String Add(Complex a1){
        int x;
        int y;
        x=real+a1.real;
        y=img+a1.img;
        return (x+"+"+y+"i");
    }
    String Mul(Complex a1){
        int x;
        int y;
        x=real*a1.real;
        y=img*a1.img;
        return (x+"+"+y+"i");
    }
}
public class complexno {
    public static void main(String[] args) {
        Complex obj1=new Complex();
        obj1.input();
        Complex obj2=new Complex();
        obj2.input();
        String v=obj1.Add(obj2);
        String v2=obj1.Mul(obj2);
        System.out.println(v);
        System.out.println(v2);
    }
}
