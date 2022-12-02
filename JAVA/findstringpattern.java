import java.util.*;
public class findstringpattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String a=s.nextLine();

        String b=s.nextLine();
        
        int size1=a.length();
        int size2=b.length();
        if(size1<size2){
            System.out.println("invalid");
        }
        else{
            for(int i=0,j=size2;j<=size1;i++,j++){
                String x=a.substring(i, j);
                String y=b.substring(0, size2);
                if(x.equals(y)){
                    System.out.println("yes");
                }

            }
        }

    }
}
