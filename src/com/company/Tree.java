package com.company;

public class Tree {
    private Node root;
    private Node temp;


    public void add(int key, Object object) {
        if (root == null) {
            Node node = new Node(key, object);
            root = node;
        } else {
            if (key < temp.getKey()) {
                if (temp.getLeft() == null) {
                    Node node = new Node(key, object);
                    temp.setLeft(node);
                } else {
                    temp = temp.getLeft();
                    add(key, object);
                }
            } else if (key > temp.getKey()) {
                if (temp.getRight() == null) {
                    Node node = new Node(key, object);
                    temp.setRight(node);
                } else {
                    temp = temp.getRight();
                    add(key, object);
                }
            } else {
                System.out.println("yes key");
            }
        }
        temp = root;
    }

    public void delete(int key) {
        Node node = temp;
        if (root == null) {
            System.out.println("No elements");
        } else if (key == root.getKey()) {
            root = null;
            System.out.println("Дерево удалено");
        } else {
            if (key < node.getKey()) {
                if (node.getLeft().getKey() == key || node.getRight().getKey() == key) {
                    node.setRight(node.getRight().getRight());
                    temp = node.getRight().getLeft();
                    add(temp.getKey(), temp.getObject());
                } else
                    delete(key);
            }

        }
    }

    public void print(int key) {
        Node node = temp;
        if (root == null) {
            System.out.println("No elemets");
        }
        if (temp == null) {
            System.out.println("нет числа");
        } else {
            if (node.getKey() == key) {
                System.out.println(node);
            } else if (key < node.getKey()) {
                temp = node.getLeft();
                print(key);
            } else if (key > node.getKey()) {
                temp = node.getRight();
                print(key);
            }
        }
        temp = root;
    }
}



