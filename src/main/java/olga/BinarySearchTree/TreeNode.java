package olga.BinarySearchTree;

public class TreeNode {
    int val;
    TreeNode left;

    TreeNode right;

    public TreeNode(int val) {
        this.val = val;
        this.left = this.right = null;
    }
}

class BinarySearchTree{
    TreeNode root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int val){
        root = insertRec(root, val);

    }

    private TreeNode insertRec(TreeNode root, int val) {
        if(root == null){
            return new TreeNode(val);
        }

        // Recursive case: insert in left or right subtree
        if(val < root.val){
            root.left = insertRec(root.left, val);
        } else if (val > root.val) {
            root.right = insertRec(root.right, val);
            
        }

        return root;
    }

    // 🔹 Search for a value in BST
    public boolean search(int val){
        return searchRec(root,  val);

    }

    private boolean searchRec(TreeNode root, int val) {
        if(root == null)return false;


        if(root.val == val)return true;


        // Search left or right subtree
        return val < root.val ? searchRec(root.left, val) : searchRec(root.right, val);
    }

    // 🔹 Delete a node from BST
    public void delete(int val){
        root = deleteRec(root, val);

    }

    private TreeNode deleteRec(TreeNode root, int val) {
        if(root == null){
            return null;
        }

        if(val < root.val){
            root.left = deleteRec(root.left, val);
        } else if (val > root.val) {
            root.right = deleteRec(root.right, val);
        }else {
            // Case 1: No child
            if(root.left == null && root.right == null){
                return null;
            }
            // Case 2: One child
            if(root.left == null)return root.right;

            if(root.right == null)return root.left;

            // Case 3: Two children
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteRec(root.right, minNode.val);
        }
        return root;
    }

    // 🔹 Find the minimum node in a subtree
    private TreeNode findMin(TreeNode root) {
        while (root.left != null){
            root = root.left;
        }
        return root;
    }

    // 🔹 Inorder Traversal (Left -> Root -> Right)
    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode root) {
        if(root != null){
            inOrderRec(root.left);
            System.out.print(root.val + " ");
            inOrderRec(root.right);
        }
    }


    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(50);
        bst.insert(30);
        bst.insert(70);
        bst.insert(20);
        bst.insert(40);
        bst.insert(60);
        bst.insert(80);

        System.out.print("Inorder Traversal: ");
        bst.inOrder();

        // Search elements
//        System.out.println("Search 40: " + bst.search(40)); // true
//        System.out.println("Search 90: " + bst.search(90)); // false

        // Delete a node
//        bst.delete(30);
//        System.out.print("Inorder Traversal after deleting 30: ");
//        bst.inOrder();
    }
}
