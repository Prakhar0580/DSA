public class Delete_Node {
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
     public static  Node func(Node root){
        while(root.left!=null){
            root=root.left;

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
   
    public static Node delete(Node root,int val){
        if(root==null){
            return null;
        }
        if(root.data<val){
             root.right=delete(root.right,val);
        }else if(root.data>val){
            root.left=delete(root.left,val);
        }else{
            //case 1 node is having 0 child
            if(root.right==null&&root.left==null){
                return null;
            }
            //case 2 node is having 1 child
            if(root.left==null){
                return root.right;
            } 
            if(root.right==null){
                return root.left;
            }
            //case 3 node is having 2 child
            Node IS=func(root.right);
            root.data=IS.data;
           root.right= delete(root.right,IS.data);
        }
        return root;
    }
    public static void main(String[] args) {
        int arr[]={5,1,3,4,2,7};
        Node root=null;
      for(int i=0;i<arr.length;i++){
         root= buildBST(root,arr[i]);
      }
      inorder(root);
      System.out.println();
      delete(root,3);
      inorder(root);
    }
}
