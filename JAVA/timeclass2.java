import java.util.Scanner;
class InnerTime {
    int hh;
    int mm;
    int ss;
    public void input(Scanner sc) {
        System.out.println("Enter Number of hours: ");
        hh = sc.nextInt();
        System.out.println("Enter Number of minutes: ");
        mm = sc.nextInt();
        System.out.println("Enter Number of seconds: ");
        ss = sc.nextInt();
    }

    public void add(InnerTime T){
        int sec = ss+T.ss;
        int min = ss/60;
        sec= sec%60;
        min = min + mm + T.mm; 
        int hour = min/60;
        min = min%60;
        hour = hour + hh + T.hh;
        hh = hour;
        mm = min;
        ss = sec;
    }
    
    public void display(){
        System.out.println("Hours: "+hh+" ");
        System.out.println("Minutes: "+mm+" ");
        System.out.println("Seconds: "+ss+" ");
    }
}
public class timeclass2 {
    public static void main(String[] args) {
        InnerTime T1 = new InnerTime();
        InnerTime T2 = new InnerTime();

        Scanner scanner = new Scanner(System.in);
        T1.input(scanner);
        T2.input(scanner);

        T1.display();
        T2.display();

        T1.add(T2);
        System.out.println("After Adding Two Times");
        T1.display();
    }
}
