package com.company;

public class Node {
    private int key;
    private Object object;
    private Node left;
    private Node right;

    public Node(int key, Object object) {
        this.key = key;
        this.object = object;
    }

    public int getKey() {
        return key;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", object=" + object +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
