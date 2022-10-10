public class diamond {
    public static void main(String[] args) {
        String x = "$";
        int number=5;
        int i,n;
        for (i=1; i < number; i++) {
            for(n=1;n<=number-i;n++){
                System.out.print(" ");
            }
            for(n=1;n<=i*2-1;n++){
                System.out.print(x);
            }
            for(n=1;n<=number-i;n++){
                System.out.print("  ");
            }
            for(n=1;n<=i*2-1;n++){
                System.out.print(x);
            }
            System.out.println();
        }
        for(i=number-2;i>0;i--){
            for(n=1;n<=number-i;n++){
                System.out.print(" ");
            }
            for(n=1;n<=i*2-1;n++){
                System.out.print(x);
            }
            for(n=1;n<=number-i;n++){
                System.out.print("  ");
            }
            for(n=1;n<=i*2-1;n++){
                System.out.print(x);
            }
            System.out.println();
        }
    }
}
