//2d array
//arrangement of Data in rows and columns
import java.util.Scanner;
class Matrix{
    private int mat[][]=new int[3][3];
    private int i,j;
    public void input(){
        Scanner sc=new Scanner(System.in);
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.println("Input value for mat["+i+"]["+j+"] :");
                mat[i][j]= sc.nextInt();
            }
        }
    }
    public void display(){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
    public void add(Matrix A){
        for(i=0;i<3;i++){
            for(j=0;j<3;j++){
                System.out.print(mat[i][j]+A.mat[i][j]+" ");
            }
            System.out.println();
        }
    }
}
public class J_2Darray {
    public static void main(String[] args) {
        Matrix A=new Matrix();
        A.input();
        A.display();
        Matrix B=new Matrix();
        B.input();
        A.add(B);
    }
}

