class Node {
 Node left;
 Node right;
 int data;
 Node(int data) {
 this.data = data;
 left = null;
 right = null;
 } 
 }
 public class BinaryTree 
 { 
      // Root of Binary Tree 
 Node root;  
 // Constructors 
 BinaryTree(int key) 
 { 
 root = new Node(key); 
 } 
 
 BinaryTree() 
 { 
 root = null; 
 } 
 
 // Methods 
  void addData(int data)  { 
        root = insert(root, data); 
    } 
   
    Node insert(Node root, int data) { 
        if (root == null) { 
            root = new Node(data); 
            return root; 
        }
        if (data < root.data)    
            root.left = insert(root.left, data); 
        else if (data > root.data)    
            root.right = insert(root.right,data); 
          
        return root; 
    } 
 boolean searchData(int key)  { 
        root = searchD(root, key); 
        if (root!= null)
            return true;
        else
            return false;
    } 
   Node searchD(Node root, int data){ 
        if (root==null || root.data==data) 
            return root; 
        // val is greater than root's key 
        if (root.data > data) 
            return searchD(root.left, data); 
        // val is less than root's key 
        return searchD(root.right,data); 
    } 

 // search data from Binary Tree and return true/false, check all possible conditions 
 // handle all possible exceptions/rrors 
   void inorder() { 
        inorder(root); 
    } 
  void inorder(Node root) { 
        if (root != null) { 
            inorder(root.left); 
            System.out.print(root.data + " "); 
            inorder(root.right); 
        } 
    } 
    void postOrder() { 
        postOrder(root); 
    } 
  void postOrder(Node root) { 
        if (root != null) { 
            postOrder(root.left);
            postOrder(root.right); 
             System.out.print(root.data + " "); 
        } 
    } 
    void preOrder() { 
        preOrder(root); 
    } 
  void preOrder(Node root) { 
        if (root != null) { 
              System.out.print(root.data + " ");
            preOrder(root.left); 
            preOrder(root.right); 
        } 
    } 
 int findHeight(Node aNode) {
    if (aNode == null) {
        return -1;
    }

    int lefth = findHeight(aNode.left);
    int righth = findHeight(aNode.right);

    if (lefth > righth) {
        return lefth + 1;
    } else {
        return righth + 1;
    }
}
 public static void main(String[] args) 

 {
     BinaryTree bt=new BinaryTree(10);
     bt.addData(5);
         bt.addData(2);
           bt.addData(8);
             bt.addData(1);
               bt.addData(30);
                 bt.addData(4);
           bt.inorder();
             System.out.println();
             bt.preOrder();
               System.out.println();
               bt.postOrder();
           boolean val=bt.searchData(9);
           System.out.println();
           System.out.println("9 Found: "+val);
 // Test the main method by creating node for different multiple nodes with children 
 } 
 }