import java.util.*;
public class mcp {
    public static void main(String[] args) {
        int mx1[][]={{1,7,3,2},{4,6,5,8},{2,9,7,3}};
        
        int mx2[][]=new int[3][4];

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(i==0&&j==0){
                    mx2[i][j]=mx1[i][j];
                }
                else if(i==0&&j>0){
                    mx2[i][j]=mx2[i][j-1]+mx1[i][j];
                }
                else if(j==0&&i>0){
                    mx2[i][j]=mx2[i-1][j]+mx1[i][j];
                }
                else{
                    mx2[i][j]=Math.min(mx2[i-1][j],mx2[i][j-1])+mx1[i][j];
                }

            }
        }
        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                System.out.print(mx2[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println();

        System.out.println(mx2[2][3]);
    }

    
}
