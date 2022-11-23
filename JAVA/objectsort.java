

//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE
//WRONG CODE

import java.util.*;
class students{
    public String name;
    public String city;
    public int contact;
    students(){
        name="NULL";
        city="NULL";
        contact=0;
    }
    void add(String n, String c, int no){
        name=n;
        city=c;
        contact=no;
    }
}
public class objectsort {
    static void bubblesort(students list[],int n){
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                String n1=list[j].name;
                String n2=list[j+1].name;
                int retval=n1.compareTo(n2);
                if(retval<0){
                    students temp=new students();
                    temp=list[j];
                    list[j]=list[j+1];
                    list[j+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number Of Students: ");
        int size=sc.nextInt();
        students list[]=new students[size];
        sc.nextLine();
        for(int i=0;i<size;i++){
            list[i]=new students();
            System.out.println("Enter Name: ");
            String name=sc.nextLine();
            System.out.println("Enter City");
            String city=sc.nextLine();
            System.out.println("Enter Contact: ");
            int contact=sc.nextInt();
            sc.nextLine();
            list[i].add(name, city, contact);
        }
        bubblesort(list, size);
        for(int i=0;i<size;i++){
            System.out.println(list[i].name);
        }
    }
    
}
