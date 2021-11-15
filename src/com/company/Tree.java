package com.company;

public class Tree {
    private Node root;

    public void add(int key, Object object) {
        Node node = new Node(key, object);
        if (root == null) {
            root = node;
        } else {
            Node temp = search(key, root);
            if (temp.getKey() == key) {
                System.out.println("yes key");
            } else if (key < temp.getKey()) {
                temp.setLeft(node);
            } else if (key > temp.getKey()) {
                temp.setRight(node);
            }
        }
    }

    private Node search(int key, Node object) {
        Node node = object;
        if (key < node.getKey()) {
            if (node.getLeft() == null) {
                return node;
            } else {
                node = node.getLeft();
                return search(key, node);
            }
        } else if (key > node.getKey()) {
            if (node.getRight() == null) {
                return node;
            } else {
                node = node.getRight();
                return search(key, node);
            }
        } else {
            return node;
        }
    }

    public Object getObject(int key) {
        if (root == null) {
            return null;
        } else {
            Node node = search(key, root);
            return node.getObject();
        }
    }

//    public void delete(int key) {
//        Node node = temp;
//        if (root == null) {
//            System.out.println("No elements");
//        } else if (key == root.getKey()) {
//            root = null;
//            System.out.println("Дерево удалено");
//        } else {
//            if (key < node.getKey()) {
//                if ((node.getLeft().getKey() == key || node.getRight().getKey() == key)) {
//                    node.setRight(node.getRight().getRight());
//                    temp = node.getRight().getLeft();
//                    add(temp.getKey(), temp.getObject());
//                } else
//                    delete(key);
//            }
//        }
//    }


}



