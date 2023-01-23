import java.util.Scanner;

public class knapsack {
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number Of Items: ");
        int items=sc.nextInt();
        float obj[][]=new float[items][3];
        float rate[]=new float[items];

        System.out.println("Enter Items");
        for(int i=0;i<items;i++){
            System.out.println("Enter "+i+"'s Price: ");
            obj[i][0]=sc.nextInt();
            System.out.println("Enter "+i+"'s Weight: ");
            obj[i][1]=sc.nextInt();
            obj[i][2]=obj[i][0]/obj[i][1];
        }
        System.out.println("Item\tPrice\tWeight\tRate");
        for(int i=0;i<items;i++){
            System.out.println(i+"\t"+obj[i][0]+"\t"+obj[i][1]+"\t"+obj[i][2]);
        }
        for(int i=0;i<items;i++)
         {
            float temp[]=new float[3];
        	     for(int j=0;j<items;j++)
        	     {
        	    	 if(obj[i][2]>obj[j][2])
        	    	 {
        	    		 temp[0]=obj[i][0];
        	    		 temp[1]=obj[i][1];
        	    		 temp[2]=obj[i][2];
        	    		 obj[i][0]=obj[j][0];
        	    		 obj[i][1]=obj[j][1];
        	    		 obj[i][2]=obj[j][2];
        	    		 obj[j][0]=temp[0];
        	    		 obj[j][1]=temp[1];
        	    		 obj[j][2]=temp[2];
        	    		 	 
        	    	 }
        	     }
         }
        System.out.println("Item\tPrice\tWeight\tRate");
        for(int i=0;i<items;i++){
            System.out.println(i+"\t"+obj[i][0]+"\t"+obj[i][1]+"\t"+obj[i][2]);
        }

        float cap;
        float profit=0;
        System.out.println("Enter Capacity: ");
        cap=sc.nextInt();
        float bits[]=new float[items];
        for(int i=0;i<items;i++){
            if(cap>=obj[i][1]){
                bits[i]=1;
                cap=cap-obj[i][1];
            }
            else if(cap<obj[i][1]){
                bits[i]=cap/obj[i][1];
            }
            else{
                bits[i]=0;
            }
        }
        for(int i=0;i<items;i++){
            profit=profit+(bits[i]*obj[i][0]);
        }

        System.out.println("profit =\t"+profit);

        
    }
}
