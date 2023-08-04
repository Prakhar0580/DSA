import java.util.*;
public class UnsortedBST_To_SortedBST {
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
    public static void createArrayList(Node root,ArrayList<Integer> arr){
        if(root==null){
            return;
        }
        createArrayList(root.left,arr);
        arr.add(root.data);
        createArrayList(root.right,arr);
        return;

    }
    public static Node CreateBST(ArrayList<Integer> arr,int si,int ei){
        if(si>ei){
            return null;
        }
        int mid=(si+ei)/2;
        Node newNode=new Node(arr.get(mid));
        newNode.left=CreateBST(arr,si,mid-1);
       newNode.right= CreateBST(arr,mid+1,ei);
       return newNode;
    }
    public static void main(String args[]){
        Node root=new Node(8);
        root.left=new Node(6);
        root.left.left=new Node(5);
        root.left.left.left=new Node(3);

        root.right=new Node(10);
        root.right.right=new Node(11);
        root.right.right.right=new Node(12);
          /*Node root=null;
        for(int i=0;i<arr.length;i++){
           root= buildBST(root,arr[i]);
        }*/
        System.out.println();
        ArrayList<Integer> arr=new ArrayList<>();
        createArrayList(root,arr);
        root=CreateBST(arr,0,arr.size()-1);
        System.out.print(root.left.data);
            
    }
}
