import java.util.*;
import java.math.*;

class mathematicalproblem {
    public static void primefactor(int value) {
        for (int i = 2; i < value; i++) {
            while (value % i == 0) {
                System.out.println(i + " ");
                value = value / i;
            }
        }
        if (value > 2) {
            System.out.println(value);
        }
    }

    public static void gcd(int a, int b) {
        int hcf = 0;
        for (int i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                hcf = i;
            }
        }
        System.out.println(hcf);
    }

}

class sort {
    public static void bubblesort(int arr[]) {
        int size = arr.length;
        int temp = 0;
        for (int i = 0; i < size; i++) {
            for (int j = 1; j < (size - i); j++) {
                if (arr[j - 1] > arr[j]) {
                    temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;
                }
            }
        }
    }
}

class Order implements Comparable<Order> {
    private int orderId;
    private int amount;
    private String customer;

    public static class OrderByAmount implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.amount > o2.amount ? 1 : (o1.amount < o2.amount ? -1 : 0);
        }

    }

    public static class OrderByCustomer implements Comparator<Order> {

        @Override
        public int compare(Order o1, Order o2) {
            return o1.customer.compareTo(o2.customer);
        }
    }

    public Order(int orderId, int amount, String customer) {
        this.orderId = orderId;
        this.amount = amount;
        this.customer = customer;
    }

    @Override
    public int compareTo(Order o) {
        return this.orderId > o.orderId ? 1 : (this.orderId < o.orderId ? -1 : 0);
    }

    @Override
    public String toString() {
        return String.valueOf(orderId);
    }
    
}

class searching {
    public static Boolean linearsearch(int arr[], int n) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == n) {
                return true;
            }
        }
        return false;
    }

    public static Boolean binarysearch(int arr[], int n, int l, int r) {
        int first = 0;
        if (arr[first] == n) {
            return true;
        }
        Arrays.sort(arr);
        int mid = (l + r) / 2;
        if (arr[mid] == n) {
            return true;
        } else if (n > arr[mid]) {
            return binarysearch(arr, n, mid, r);
        } else {
            return binarysearch(arr, n, l, mid - 1);
        }
    }

    public static Boolean exponentialsearch(int arr[], int n, int x) {
        if (arr[0] == n) {
            return true;
        }
        int i = 1;
        while (i < x && arr[i] <= x) {
            i = i * 2;
        }
        return binarysearch(arr, x, i / 2, Math.min(i, n - 1));
    }
}

public class javapractice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of the Array:  ");
        // int size=sc.nextInt();
        // System.out.println("Enter Elements");
        // int a[]= new int[size];
        // for(int i=0;i<size;i++){
        // a[i]=sc.nextInt();
        // }
        // System.out.println("Enter value you wish to search: ");
        // int value=sc.nextInt();
        // System.out.println("LINEAR SEARCH:");
        // boolean check=searching.linearsearch(a, value);
        // if(check==true){
        // System.out.println("ELEMENT FOUND");
        // }
        // System.out.println("BINARY SEARCH:");
        // boolean check2=searching.binarysearch(a,value,0,size-1);
        // if(check2==true){
        // System.out.println("ELEMENT FOUND");
        // }
        // System.out.println("EXPONENTIAL SEARCH");
        // boolean check3=searching.exponentialsearch(a, size, value);
        // if(check3==true){
        // System.out.println("ELEMENT FOUND");
        // }

        // BigInteger x= new BigInteger("34");
        // BigInteger y= new BigInteger("68");

        // BigInteger val= x.gcd(y);
        // System.out.println(val);

        Order ord1 = new Order(101, 2000, "John");
        Order ord2 = new Order(102, 3000, "Kal");
        Order ord3 = new Order(103, 1000, "Bruce");

        List<Order> orders = new ArrayList<Order>();

        orders.add(ord3);
        orders.add(ord1);
        orders.add(ord2);
        Collections.sort(orders);
        Collections.sort(orders, new Order.OrderByAmount());
        System.out.println(orders);

    }

}
