public class manachersalgorithm {
    public static void main(String[] args) {
        String pat="tab";
        String data="bbssddtabss";
        String value=pat+"*"+data;
        //tab*bbsddtab
        char[] arr=value.toCharArray();

        int patsize=pat.length();
        int datasize=data.length();
        int valuesize=value.length();

        int i=0;
        int j=patsize+1;
        int found=-1;
        int x=1;
        while(i!=patsize){
            if(j==valuesize){
                System.out.println("not found");
                break;
            }
            if(i!=0&&arr[i]!=arr[j]){
                i=0;
            }
            if(arr[i]==arr[j]){
                i++;
            }
            if(i==patsize-1){
                found=j;
                System.out.println(found-1-patsize-1);
            }
            j++;
            x++;

        }
    }
}
