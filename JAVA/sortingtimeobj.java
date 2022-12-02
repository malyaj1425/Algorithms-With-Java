import java.util.*;
public class sortingtimeobj {
    
    public static void main(String[] args) {
        Time obj1=new Time(6,23,1);
        Time obj2=new Time(6,45,2);
        Time obj3=new Time(2,23,3);

        List<Time> timer=new ArrayList();
        timer.add(obj1);
        timer.add(obj2);
        timer.add(obj3);

        Collections.sort(timer, new Time.hours());
        Collections.sort(timer, new Time.mins());
        Collections.sort(timer, new Time.secs());
        System.out.println(timer);
    }
}
class Time implements Comparable<Time>{
    private int hh;
    private int mm;
    private int ss;

    public static class hours implements Comparator<Time>{

        @Override
        public int compare(Time o1, Time o2){
            return o1.hh>o2.hh?1:o2.hh>o1.hh?-1:0;
        }
    }
    public static class mins implements Comparator<Time>{

        @Override
        public int compare(Time o1, Time o2){
            return o1.mm>o2.mm?1:o2.mm>o1.mm?-1:0;
        }
    }
    public static class secs implements Comparator<Time>{

        @Override
        public int compare(Time o1, Time o2){
            return o1.ss>o2.ss?1:o2.ss>o1.ss?-1:0;
        }
    }

    @Override
    public int compareTo(Time t){
        return 0;
    }
    public Time(int hh,int mm,int ss){
        this.hh=hh;
        this.mm=mm;
        this.ss=ss;
    }
    @Override
    public String toString(){
        return String.valueOf(ss);
    }
}
