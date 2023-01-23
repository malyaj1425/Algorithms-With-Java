import java.util.Scanner;

class PQue{
	private int data[][];
	private int front;
	private int rear;
	
	PQue(int size)
	{
		data=new int[size][2];
		front=0;
		rear=0;
		
	}
	
	public void enque(int data,int priority)
	{
		  if(front==rear)
		  {
			  this.data[rear][0]=data;
			  this.data[rear][1]=priority;
			  rear++;
			  
		  }
		  else
		  {
			  for(int i=front;i<rear;i++)
			  {
				   if(this.data[i][1]<=priority)
				   {
					   continue;
				   }
				   else
				   {
					  for(int j=rear;j>i;j--)
					  {
						  this.data[j][0]=this.data[j-1][0];
						  this.data[j][1]=this.data[j-1][1];
					  }
					  this.data[i][0]= data;
					  this.data[i][1]= priority;
					  rear++;
					  break;
					  
				   }
					   
			  }
		  }
	}
	
	public int deque()
	{
		/*System.out.println("Processed Data");
		System.out.print(this.data[front][0]);
		System.out.print(this.data[front++][1]);
		System.out.println();*/
		return(this.data[front++][0]);
	}
	
	public void display()
	{
		for(int i=front;i<rear;i++)
		{
			System.out.print(this.data[i][0]);
			System.out.print(this.data[i][1]);
			System.out.println();
		}
	}
}

public class PrioriyQueArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      				
		PQue Obj=new PQue(10);
		int data, priority;
		int choice;
		Scanner sc=new Scanner(System.in);
		
		while(true)
		{
			System.out.println("Enter your Choice");
			System.out.println("1. For Enque");
			System.out.println("2. For Deque");
			System.out.println("3. For Display");
			choice=sc.nextInt();
			switch(choice)
			{
			case 1:
				System.out.println("Enter data");
				data=sc.nextInt();
				System.out.println("Ente Prioroty");
				priority=sc.nextInt();
				Obj.enque(data, priority);
				break;
			case 2:
				 data=Obj.deque();
				 System.out.println("Processed Data="+data);
				 break;
			case 3:
				Obj.display();
				
				
			}
			
			
		}
      
	}

}