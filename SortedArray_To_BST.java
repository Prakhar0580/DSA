public class SortedArray_To_BST {
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
    public static Node balancedBST(int arr[],int si,int ei){
        if(si>=ei){
            Node newNode=new Node(arr[si]);
            return newNode;
        }
        int mid=(si+ei)/2;
        Node newNode=new Node(arr[mid]);
        newNode.left=balancedBST(arr,si,mid-1);
        newNode.right=balancedBST(arr,mid+1,ei);
        return newNode;
    }
    public static void main(String args[]){
        int arr[]={3,5,6,8,10,11,12};
         /*  Node root=null;
        for(int i=0;i<arr.length;i++){
           root= buildBST(root,arr[i]);
        }
        inorder(root);*/
        Node root=balancedBST(arr,0,arr.length-1);
        System.out.println(root.data);
    }
}
