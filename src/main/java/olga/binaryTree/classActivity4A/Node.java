package olga.binaryTree.classActivity4A;

import java.util.Stack;

public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = right = null;
    }
}

class BinaryTree{
    Node root; // Root of the binary tree

    // Iterative preorder traversal method
    void iterativePreorder(Node root) {
        if (root == null) {
            return; // If the tree is empty, return
        }

        // Create an empty stack and push the root node to it
        Stack<Node> stack = new Stack<>();
        stack.push(root);

        // Loop until the stack is empty
        while (!stack.isEmpty()) {
            // Pop the top node from the stack and process it
            Node currentNode = stack.pop();
            System.out.print(currentNode.data + " ");

            // Push the right child first (so that the left child is processed first)
            if (currentNode.right != null) {
                stack.push(currentNode.right);
            }

            // Push the left child
            if (currentNode.left != null) {
                stack.push(currentNode.left);
            }
        }

    }

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();

        // Construct the binary tree
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(6);

        // Perform iterative preorder traversal
        System.out.println("Iterative Preorder Traversal:");
        tree.iterativePreorder(tree.root);
    }
    }
