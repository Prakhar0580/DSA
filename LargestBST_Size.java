public class LargestBST_Size {
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
    static class info{
        boolean IsBst;
        int size;
        int max;
        int min;
        public  info(boolean IsBst,int size,int max,int min){
            this.IsBst=IsBst;
            this.size=size;
            this.max=max;
            this.min=min;
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
    static int maxsize=0;
    public static info largestBST(Node root){
        if(root==null){
            return new info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        }
        info L_node=largestBST(root.left);
        info R_node=largestBST(root.right);
        int size=L_node.size+R_node.size+1;
        int min=Math.min(root.data,Math.min(L_node.min,R_node.min));
        int max=Math.max(root.data,Math.max(L_node.max,R_node.max));
        if(L_node.IsBst&&R_node.IsBst){
            maxsize=Math.max(maxsize,size);
        }
        if(root.data<L_node.max||root.data>R_node.min){
            return new info(false,size,min,max);
        }
        return new info(true,size,min,max);
    }
    public static void main(String args[]){
        //Left Subtree
        Node root=new Node(50);
         root.left=new Node(30);
         root.left.left=new Node(5);
         root.left.right=new Node(20);

         //Right subtree
         root.right=new Node(60);
         root.right.left=new Node(45);
         root.right.right=new Node(70);
         root.right.right.left=new Node(65);
         root.right.right.right=new Node(80);
         largestBST(root);
         System.out.println(maxsize);



}
}
