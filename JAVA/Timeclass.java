import java.util.Scanner;
class Time{
    private int hh,mm,ss;
    public void input(){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Hrs: ");
        hh=s.nextInt();
        System.out.println("Enter Mins: ");
        mm=s.nextInt();
        System.out.println("Enter Secs: ");
        ss=s.nextInt();
    }
    public void add(Time t){
        int sec=ss+t.ss;
        int min=mm+t.mm;
        min+=sec/60;
        sec=sec%60;
        int hour=hh+t.hh;
        hour+=min/60;
        min=min%60;
        hour=hour%60;
        System.out.println(hour+":"+min+":"+sec);
    }
}
public class Timeclass {
    public static void main(String[] args){
        Time obj=new Time();
        Time obj2=new Time();
        obj.input();
        obj2.input();
        obj.add(obj2);
    }
}
