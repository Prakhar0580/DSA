import java.util.*;
public class BT_Using_Preorder_Traversal {
    static class Node{
        int data;
        Node left;
        Node right;
        public  Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
       
    }
     public static class BinaryTrees{
        static int indx=-1;
        public static Node Binary_Trees(int Node[]){
            indx++;
            if(Node[indx]==-1){
                return null;
            }
            Node newNode=new Node(Node[indx]);
            newNode.left=Binary_Trees(Node);
            newNode.right=Binary_Trees(Node);
            return newNode;

        }
    }
    public static void main(String args[]){
        int Node[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
        BinaryTrees trees=new BinaryTrees();
        Node root=trees.Binary_Trees(Node);
        System.out.print(root.right.data);
    }
}
