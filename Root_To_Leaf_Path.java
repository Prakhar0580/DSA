import java.util.*;
public class Root_To_Leaf_Path {
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
    public static Node buildBST(Node root,int val){
        if(root==null){
            Node newNode=new Node(val);
            root=newNode;
            return root;
        }
        if(val<root.data){
           root.left= buildBST(root.left,val);
        }else{
            root.right=buildBST(root.right,val);
        }
        return root;
    }
    public static void inorder(Node root){
        if(root==null){
            return;
        }
        inorder(root.left);
        System.out.print(root.data+" ");
        inorder(root.right);
    }
    public static void path(Node root,ArrayList<Integer>path){
        
        if(root==null){
            return;
        }
        path.add(root.data);
        if(root.left==null&&root.right==null){
            for(int i=0;i<path.size();i++){
                System.out.print(path.get(i));
            }
            System.out.println();
        }
        path(root.left,path);
        path(root.right,path);
        path.remove(path.size()-1);
        return;
    }
    public static void main(String args[]){
        int arr[]={5,1,3,4,2,7};
          Node root=null;
        for(int i=0;i<arr.length;i++){
           root= buildBST(root,arr[i]);
        }
        ArrayList<Integer> path=new ArrayList<>();
        path(root,path);
}
}
