package olga.binaryTree.classActivity2A;

public class Node {
    int data; // Represents the data stored in the node (e.g., an integer value).
    Node left; // Reference to the left child of the node.
    Node right; // Reference to the right child of the node.


    public Node(int data) {
        this.data = data; // Assign the provided data to the node.
        left = right = null; // Initialize left and right children as null (no children initially).
    }
}

class BinaryTree{
    Node root; // Represents the root node of the binary tree - It serves as the starting point for traversals.

    // Method to perform pre-order traversal of the binary tree.
    void preOrder(Node node){

        if(node == null){
            return;// Base case: if the node is null, return (stop recursion).
        }
        // Process the current node by printing its data.
        System.out.print(node.data + " ");

        // Recursively traverse the left subtree - recursive method is a method that calls itself.
        preOrder(node.left);
        // Recursively traverse the right subtree.
        preOrder(node.right);

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construct the tree
        tree.root = new Node(1); // Create the root node with data = 1.
        tree.root.left = new Node(2); // Create the left child of the root with data = 2.
        tree.root.right = new Node(3);// Create the right child of the root with data = 3.
        tree.root.left.left = new Node(4);// Create the left child of node 2 with data = 4.
        tree.root.left.right = new Node(5);// Create the right child of node 2 with data = 5.
        tree.root.right.right = new Node(6);// Create the right child of node 3 with data = 6.

        // Perform pre-order traversal starting from the root node.
        System.out.println("Pre-order traversal of binary tree:");
        tree.preOrder(tree.root);

    }

    /**
     * Explanation of Pre-order Traversal
     * Visit the root node (print 1).
     *
     * Traverse the left subtree:
     *
     * Visit node 2 (print 2).
     *
     * Traverse the left subtree of node 2:
     *
     * Visit node 4 (print 4).
     *
     * Traverse the right subtree of node 2:
     *
     * Visit node 5 (print 5).
     *
     * Traverse the right subtree:
     *
     * Visit node 3 (print 3).
     *
     * Traverse the right subtree of node 3:
     *
     * Visit node 6 (print 6).
     *
     * This results in the output: 1 2 4 5 3 6.
     */
}




