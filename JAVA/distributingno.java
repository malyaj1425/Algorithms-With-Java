public class distributingno {
    static int dist(int m,int n,int k){
        if(m<=n-k+1){
            return(m+k-1);
        }
        m=m-(n-k+1);
        return (m%n==0)?n:m%n;
    }
    public static void main(String[] args) {
        int n = 5;
        int m = 8;
        int k = 2;
        System.out.println(dist(m,n,k));
    }
}
