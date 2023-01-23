import java.util.*;
import java.io.*;
public class BinarySearchTree {
    

    class Node{
        int data;
        Node left,right;

        public Node(int item){
            data=item;
            left=right=null;
        }
    }

    Node root;

    BinarySearchTree() {
        root=null;
    }

    BinarySearchTree(int val){
        root= new Node(val);
    }

    void insert(int val){
        root= insert(root,val);
    }

    Node insert(Node root,int val){
        if(root==null){
            root=new Node(val);
            return root;
        }
        else if(val<root.data){
            root.left=insert(root.left, val);
        }
        else if(val>root.data){
            root.right=insert(root.right, val);
        }
        return root;
    }
    void inorder(){inorder(root);}
    void inorder(Node root){
        if (root != null) {
            inorder(root.left);
            System.out.println(root.data);
            inorder(root.right);
        }
    }

    void preorder(Node root){
        System.out.println(root.data);
        inorder(root.left);
        inorder(root.right);
    }
    void postorder(Node root){
        inorder(root.left);
        inorder(root.right);
        System.out.println(root.data);
        
    }
    public static void main(String[] args) {
        BinarySearchTree tree= new BinarySearchTree();

        tree.insert(45);
        tree.insert(15);
        tree.insert(79);
        tree.insert(90);
        tree.insert(10);
        tree.insert(55);
        tree.insert(12);
        tree.insert(20);
        tree.insert(50);

        tree.inorder();
    }

}
