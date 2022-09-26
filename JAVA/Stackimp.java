class stack {
    public int size=10;
    int[] arr = new int[size];
    private int top = -1;

    public void push(int x) {
        if (isFull()) {
            System.out.println("Overflow");
        } else {
            top++;
            arr[top] = x;
        }
    }

    public void pop(int x) {
        if(isEmpty()){
            System.out.println("Underflow");
        }
        else{int y;
        y = arr[top];
        top--;
        System.out.println(y+" Popped!");
    }
    }

    public boolean isFull() {
        if (top > size) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isEmpty() {
        if (top < -1) {
            return true;
        } else {
            return false;
        }
    }

}

public class Stackimp {
    public static void main(String[] args) {
        stack obj=new stack();
        obj.size=3;
        obj.push(1);
        obj.push(2);
        obj.push(3);
        obj.push(4 );

    }
}
