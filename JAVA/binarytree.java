class Node{
    int data;
    Node left,right;
    public Node(int data){
        this.data=data;
        left=right=null;
    }
}
public class binarytree {
    
    public static void initiatenodeprint(Node root){
        if(root==null){
            return;
        }
        initiatenodeprint(root.left);
        System.out.println(root.data+" ");
        initiatenodeprint(root.right);
    }
    public static void main(String[] args) {
        Node root=new Node(0);
        root.left= new Node(1);
        root.right= new Node(2);
        root.left.left= new Node(3);
        root.left.right= new Node(4);
        
        initiatenodeprint(root);


    }
}
