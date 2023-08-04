public class Build_BST {
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
    public static void main(String args[]){
        int arr[]={13 ,10 ,18 ,3 ,11 ,15 ,20, 1 ,6 , 12};
          Node root=null;
        for(int i=0;i<arr.length;i++){
           root= buildBST(root,arr[i]);
        }
        inorder(root);
}
}
