import java.util.Scanner;

public class quadprobing {

    static void hashings(int hash[],int max,int arr[],int M){
        for(int i=0;i<M;i++){
            int x=(2*arr[i]+3)%M;
            if(hash[x]==0){
                hash[x]=arr[i];
            }
            else{
                for(int j=0;j<M;j++){
                    int val=(x+j*j)%M;
                    if(hash[val]==0){
                        hash[val]=arr[i];
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int samplesize=sc.nextInt();
        int arr[]=new int[samplesize];
        for(int i=0;i<samplesize;i++){
            arr[i]=sc.nextInt();
        }
        int x=0;
        int max = arr[0];
        for (int i = 0; i < samplesize; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        int Hashmap[]= new int[max+1];

        for(int i=0;i<=max;i++){
            Hashmap[i]=0;
        }

        hashings(Hashmap, max, arr, samplesize);

        for(int i=0;i<=max;i++){
            System.out.print(Hashmap[i]+" ");
        }
        
    }
}
