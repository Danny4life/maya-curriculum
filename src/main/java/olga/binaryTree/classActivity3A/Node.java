package olga.binaryTree.classActivity3A;

public class Node {
    int data;
    Node left;
    Node right;


    public Node(int data) {
        this.data = data;
        this.left = this.right = null;
    }
}

// Binary Tree class
class BinaryTree {
    Node root;

    // Recursive Inorder Traversal Method
    void inorder(Node node) {
        if (node == null) {
            return; // Base case: Stop when the node is null
        }

        inorder(node.left);  // Step 1: Visit left subtree
        System.out.print(node.data + " ");  // Step 2: Print the root
        inorder(node.right); // Step 3: Visit right subtree
    }

    // Main method
    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Constructing the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        System.out.println("Recursive Inorder Traversal:");
        tree.inorder(tree.root);
    }
}
