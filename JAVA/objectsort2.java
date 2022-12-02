import java.util.*;

public class objectsort2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        Order obj1= new Order(78);
        Order obj2= new Order(34);
        Order obj3= new Order(56);

        List<Order> orders= new ArrayList<Order>();

        orders.add(obj1);
        orders.add(obj2);
        orders.add(obj3);

        Collections.sort(orders, new Order.CompareAmount());

        System.out.println(orders);

        int arr[]=new int[5];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }

        Arrays.sort(arr);

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
class Order implements Comparable<Order>{
    private int amount;
    
    public static class CompareAmount implements Comparator<Order>{
        @Override
        public int compare(Order o1,Order o2){
            return o1.amount>o2.amount?1:o1.amount<o2.amount?-1:0;
        }
    }
    
    public Order(int amount){
        this.amount=amount;
    }

    @Override
    public int compareTo(Order o) {
        return 0;
    }
    @Override
    public String toString() {
        return String.valueOf(amount);
    }
}

