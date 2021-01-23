package BinaryTree;

public class BinaryTree {

    Node root;

    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.addNode(6);
        binaryTree.addNode(4);
        binaryTree.addNode(8);
        binaryTree.addNode(3);
        binaryTree.addNode(5);
        binaryTree.addNode(7);
        binaryTree.addNode(9);

        binaryTree.inOrder(binaryTree.root);
    }

    public void addNode(int data){

        Node node = new Node(data);

        if (this.root == null) {
            this.root = node;
        } else {
            Node mainNode = this.root;
            Node parent;

            while (true){
                parent = mainNode;

                if (data < mainNode.data) {
                    mainNode = mainNode.left;

                    if (mainNode == null) {
                        parent.left = node;
                        return;
                    }

                } else {
                    mainNode = mainNode.right;

                    if (mainNode == null) {
                        parent.right = node;
                        return;
                    }
                }
            }
        }
    }


    public void inOrder(Node node) {
        if (node != null) {
            inOrder(node.left);
            System.out.println(node);
            inOrder(node.right);
        }
    }


}
class Node{
    int data;

    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
