package olga.binaryTree.classActivity1A;

public class BinaryTree {

    private TreeNode root; // This root will hold all other nodes of the BT

    private class TreeNode{

        private TreeNode left; // pointing to left tree node
        private TreeNode right; // pointing to right tree node

        private int data; // Generic data to store TreeNode

        public TreeNode(int data) {
            this.data = data;
        }
    }

    public void createBinaryTree(){
        TreeNode first = new TreeNode(1);
        TreeNode second = new TreeNode(2);
        TreeNode third = new TreeNode(3);
        TreeNode fourth = new TreeNode(4);
        TreeNode fifth = new TreeNode(5);

        root = first; // root -----> first
        first.left = second;
        first.right = third;// second <-----first----->third
        second.left = fourth;
        second.right = fifth;// fourth <-----second------>fifth

        // At this point show the slide with the full diagram implementation
    }


    public static void main(String[] args) {

    }
}
