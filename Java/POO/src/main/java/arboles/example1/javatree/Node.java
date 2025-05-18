package arboles.example1.javatree;

class Node {
    int value;
    Node left;
    Node right;

    Node(int value) {
        this.value = value;
        left = right = null;
    }
}

class JavaTree {
    Node root;

    public void traverseRecursionTree(Node node) {
        if (node != null) {
            traverseRecursionTree(node.left);
            System.out.print(" " + node.value);
            traverseRecursionTree(node.right);
        }
    }

    public static void main(String[] args) {
        JavaTree javaTree = new JavaTree();

        javaTree.root = new Node(10);
        javaTree.root.left = new Node(6);
        javaTree.root.right = new Node(5);
        javaTree.root.left.left = new Node(3);

        System.out.print("Binary Tree: ");

        javaTree.traverseRecursionTree(javaTree.root);
    }
}


