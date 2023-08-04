import java.util.*;
//almost correct just only some values are repeating during the traversal of final BST
public class Merge_Two_BST {
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
    public static void inorder(Node root,ArrayList<Integer>arr){
        if(root==null){
            return;
        }
        inorder(root.left,arr);
        arr.add(root.data);
        inorder(root.right,arr);
        return;
    }
    public static Node sorted_arr_BST(ArrayList<Integer>arr,int si,int ei){
        if(si>=ei){
            Node newNode=new Node(arr.get(si));
            return newNode;
        }
        int mid=(si+ei)/2;
        Node newNode=new Node(arr.get(mid));
        newNode.left=sorted_arr_BST(arr,0,mid-1);
        newNode.right=sorted_arr_BST(arr,mid+1,ei);
        return newNode;
        

    }
    public static Node Merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2){
        int i=0;
        int j=0;
        ArrayList<Integer> arr3=new ArrayList<>();
        while(i<arr1.size()&&j<arr2.size()){
            if(arr1.get(i)<=arr2.get(j)){
                arr3.add(arr1.get(i));
                i++;
            }else{
                arr3.add(arr2.get(j));
                j++;
            }
        }
        while(i<arr1.size()){
            arr3.add(arr1.get(i));
            i++;
        }
        while(j<arr2.size()){
            arr3.add(arr2.get(j));
            j++;
        }
       /*  for(int k=0;k<arr3.size();k++){
            System.out.println(arr3.get(k));
        }*/
        Node NewrootNode=sorted_arr_BST(arr3,0,arr3.size()-1);
        return NewrootNode;
        
    }
    public static void traverse(Node root){
        if(root==null){
            return ;
        }
        traverse(root.left);
        System.out.print(root.data+" ");
        traverse(root.right);

    }
    public static void main(String args[]){
        ArrayList<Integer>arr1=new ArrayList<>();
        Node root1=new Node(2);
        root1.left=new Node(1);
        root1.right=new Node(4);

        ArrayList<Integer> arr2=new ArrayList<>();
        Node root2=new Node(9);
        root2.left=new Node(3);
        root2.right=new Node(12);
        inorder(root1,arr1);
        inorder(root2,arr2);
        //Merge(arr1,arr2);
        Node NewRootNode=Merge(arr1,arr2);
        //System.out.println(NewRootNode.data);
        traverse(NewRootNode);
        
}
}
