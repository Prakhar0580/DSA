public class Searching {
    static class Node{
        int data;
        Node right;
        Node left;
        public Node(int data){
            this.data=data;
            this.right=null;
            this.left=null;
        }
    }
    public static Node buildBST(Node root,int val){
            if(root==null){
                Node newNode=new Node(val);
                root=newNode;
                return root;
            }
            if(val<root.data){
                root.left=buildBST(root.left,val);
            }else{
                root.right=buildBST(root.right,val);
            }
            return root;
    }
    public static Boolean search(Node root,int key){
        if(root==null){
            return false;
        }
        if(root.data==key){
            return true;
        }
        if(key<root.data){  
           boolean LFTvalue= search(root.left,key);
           return LFTvalue;
        }else{
           boolean RGTvalue= search(root.right,key);
           return RGTvalue;
        }

    }
    public static void main(String args[]){
        int arr[]={5,1,3,4,2,7};
        Node root=null;
        for(int i=0;i<arr.length;i++){
            root=buildBST(root,arr[i]);
        }
        if(search(root,8)){
            System.out.println("element found");
        }else{
            System.out.println("element not found");
        }
    }
}
