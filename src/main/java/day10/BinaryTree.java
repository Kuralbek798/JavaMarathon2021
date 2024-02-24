package day10;

import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class BinaryTree {

    private Node root;

    public BinaryTree(int value) {
        this.root = new Node(value);
    }

    public void setRoot(int value) {
        this.root = setRootValueRecursive(root, value);
    }

    private Node setRootValueRecursive(Node root, int value) {

        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (root.getValue() <= value) {
            root.setRight(setRootValueRecursive(root.getRight(), value));
        } else if (root.getValue() > value) {
            root.setLeft(setRootValueRecursive(root.getLeft(), value));
        }

        return root;
    }

    void printInOrder(Node node) {
        if (node != null) {
            printInOrder(node.getLeft());
            System.out.println(node.getValue());
            printInOrder(node.getRight());
        }


    }
}

