
import java.util.*;
public class datesort {
    public class Date{
        int dd,mm,yyyy;
        Date(){
            dd=0;
            mm=0;
            yyyy=0;
        }
        void setdate(int d,int m,int yyy){
            dd=d;
            mm=m;
            yyyy=yyy;
        }
        void selsort(Date arr[],int n){
            for(int i=0;i<n;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[min].yyyy>arr[j].yyyy){
                        min=j;
                    }
                    Date temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
            for(int i=0;i<n;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[min].mm>arr[j].mm){
                        min=j;
                    }
                    Date temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
            for(int i=0;i<n;i++){
                int min=i;
                for(int j=i+1;j<n;j++){
                    if(arr[min].dd>arr[j].dd){
                        min=j;
                    }
                    Date temp=arr[min];
                    arr[min]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        Date arr[]= new Date[n];
        for(int i=0;i<n;i++){
            
        }
    }
}
