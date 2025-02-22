package olga.AVLTree;

public class TreeNode {
    int val; // Stores the value of the node

    int height; // Height of the node (used for balancing)


    TreeNode left; // Reference to the left child

    TreeNode right; // Reference to the right child

    public TreeNode(int val) {
        this.val = val;
        this.height = 1; // Initially, new nodes have height 1
    }
}

class AVLTree{
    private TreeNode root; // Root node of the AVL Tree

    // Get height of a node
    private int height(TreeNode node){
//        If node is null, return height 0 (base case).
//        Otherwise, return the node’s height.
        return (node == null) ? 0 : node.height;
    }

    // Get balance factor
    private int getBalanceFactor(TreeNode node){
//                Balance factor = Height of Left Subtree - Height of Right Subtree.
//                Determines whether the tree is balanced or needs rotation.
        return (node == null) ? 0 : height(node.left) - height(node.right);

    }

    // Right Rotate (RR Rotation FOR BALANCING THE TREE)
    private TreeNode rightRotate(TreeNode y){
        TreeNode x = y.left; // New root
        TreeNode T2 = x.right; // Save x’s right subtree

        // Perform rotation
        x.right = y;
        y.left = T2;

        // Update heights
        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x; // Return new root

//        Used for Left Heavy (LL Case).
//        Moves y down and x up.


    }

    // Left Rotate (LL Rotation LEFT ROTATION FOR BALANCING THE TREE)
    private TreeNode leftRotate(TreeNode x){
        TreeNode y = x.right; // New root
        TreeNode T2 = y.left; // Save y’s left subtree

        // Perform rotation
        y.left = x;
        x.right = T2;

        // Update heights
        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y; // Return new root

//        Used for Right Heavy (RR Case).
//        Moves x down and y up.
    }

    // Insert into AVL tree
    public void insert(int val){
        root = insertRec(root, val);

    }

    private TreeNode insertRec(TreeNode node, int val) {
        if(node == null) return new TreeNode(val); // Base case: Create new node

        // Traverse the tree to find correct insertion point
        if(val < node.val) node.left = insertRec(node.left, val); // Go left
        else if (val > node.val) node.right = insertRec(node.right, val); // Go right

        else return node; // Duplicate values not allowed

        // Update height of the current node
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor to check for imbalance
        int balance = getBalanceFactor(node);

        // **Rotations to balance the tree**
        // LL Rotation
        if(balance > 1 && val < node.left.val) return rightRotate(node);

        // RR Rotation
        if(balance < -1 && val > node.right.val) return leftRotate(node);

        // LR Rotation
        if(balance > 1 && val > node.left.val){
            node.left = leftRotate(node.left);

            return rightRotate(node);
        }

        // RL Rotation
        if(balance < -1 && val < node.right.val){
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node; // Return balanced node
    }

    // Delete a node from AVL tree
    public void delete(int val){
        root = deleteRec(root, val);
    }

    private TreeNode deleteRec(TreeNode node, int val) {
        if(node == null) return null; // Base case

        // Find the node to be deleted
        if(val < node.val) node.left = deleteRec(node.left, val);
        else if (val > node.val) node.right = deleteRec(node.right, val);
        else {
            // Node with one or no child
            if(node.left == null || node.right == null){
                node = (node.left != null) ? node.left : node.right;
            }else {
                // Node with two children, get inorder successor
                TreeNode temp = findMin(node.right);
                node.val = temp.val;
                node.right = deleteRec(node.right, temp.val);
            }
        }

        if(node == null) return null; // If tree becomes empty

        // Update height
        node.height = 1 + Math.max(height(node.left), height(node.right));

        // Get balance factor
        int balance = getBalanceFactor(node);

        // LL Rotation
        if(balance > 1 && getBalanceFactor(node.left) >= 0) return rightRotate(node);

        // LR Rotation
        if(balance > 1 && getBalanceFactor(node.left) < 0){
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }
        // RR Rotation
        if(balance < -1 && getBalanceFactor(node.right) <= 0) return leftRotate(node);

        // RL Rotation
        if(balance < -1 && getBalanceFactor(node.right) > 0){
            node.right = rightRotate(node.right);

            return leftRotate(node);
        }

        return node;
    }

    // Find the smallest node (used for deletion)
    private TreeNode findMin(TreeNode node) {
        while (node.left != null) node = node.left;

        return node;
    }

    // Search for a value
    public boolean search(int val){
        return searchRec(root, val);
    }

    private boolean searchRec(TreeNode node, int val) {
        if(node == null) return false;
        if(val == node.val) return true;

        return val < node.val ? searchRec(node.left, val) : searchRec(node.right, val);
    }

    // Inorder traversal (for testing)
    public void inOrder(){
        inOrderRec(root);
        System.out.println();
    }

    private void inOrderRec(TreeNode node) {
        if(node != null){
            inOrderRec(node.left);
            System.out.print(node.val + " ");
            inOrderRec(node.right);
        }
    }

    public static void main(String[] args) {
        AVLTree tree = new AVLTree();
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(10);
        tree.insert(25);
        tree.insert(50);

        tree.inOrder();

        // check slide 13 for final AVL Tree
        // we are getting this output as regards what is on the slide
        // because of inorder transversal which follows (left -> root -> right) order and print in ascending order
        // we first visit and get all the nodes on the left
        // then the root node
        // then all the nodes on the right

        // for deleting
        tree.delete(40);

        tree.inOrder();
    }

}
