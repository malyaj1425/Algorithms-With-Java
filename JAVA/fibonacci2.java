public class fibonacci2 {
    static int feb(int n){
        int arr[]=new int[n+1];
        arr[0]=0;
        arr[1]=1;
        for (int i=2;i<=n;i++){
            arr[i]=arr[i-1]+arr[i-2];
        }
        for(int i=1;i<=n;i++){
            System.out.println(arr[i]);
        }
        return arr[n];
    }
    public static void main(String[] args) {
        int n=10;
        n=feb(n);
        System.out.println(n);
    }
}
