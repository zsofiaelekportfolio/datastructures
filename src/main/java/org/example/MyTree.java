package org.example;

import java.util.Objects;

class TreeNode {
    private Integer value;


    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(Integer value) {
        this.value = value;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TreeNode node)) return false;
        return Objects.equals(value, node.value) && Objects.equals(leftNode, node.leftNode) && Objects.equals(rightNode, node.rightNode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(value, leftNode, rightNode);
    }

    @Override
    public String toString() {
        return "Node{" +
                "value=" + value +
                ", nextNode=" + leftNode +
                ", previousNode=" + rightNode +
                '}';
    }
}

public class MyTree {

    private TreeNode rootNode;

    public void add(Integer value) {
        TreeNode newNode = new TreeNode(value);
        if (rootNode == null) {
            rootNode = newNode;
            return;
        }
        TreeNode runningNode = rootNode;
        while (true) {
            if (value > runningNode.getValue()) {
                if (runningNode.getLeftNode() == null) {
                    runningNode.setLeftNode(newNode);
                    break;
                } else {
                    runningNode = runningNode.getLeftNode();
                }
            } else {
                if (runningNode.getRightNode() == null) {
                    runningNode.setRightNode(newNode);
                    break;
                } else {
                    runningNode = runningNode.getRightNode();
                }
            }
        }

    }

    public void printInorder(TreeNode node) {
        if (node == null) {
            return;
        }
        printInorder(node.getLeftNode());
        System.out.println(node.getValue());
        printInorder(node.getRightNode());
    }

}
