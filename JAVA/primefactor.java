
public class primefactor {
    public static void main(String[] args) {
        int x=12;
        for (int i=1;i<x+1;i++){
            if(x%i==0){
                System.out.print(i+",");
            }
        }
        int i;
        while(x!=1){
            for(i=2;i<=x;i++){
                if(x%i==0){
                    System.out.println(i);
                    x=x/i;
                }
            }
        }
    }
}
