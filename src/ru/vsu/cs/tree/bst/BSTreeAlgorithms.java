package ru.vsu.cs.tree.bst;

import ru.vsu.cs.tree.BinaryTree;

public class BSTreeAlgorithms {

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getFloorNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = value.compareTo(node.getValue());
        if (cmp == 0) {
            return node;
        } else if (cmp < 0) {
            return getFloorNode(node.getLeft(), value);
        } else {
            BinaryTree.TreeNode<T> res = getFloorNode(node.getRight(), value);
            return (res != null) ? res : node;
        }
    }

    public static <T extends Comparable<? super T>> BinaryTree.TreeNode<T> getCeilingNode(BinaryTree.TreeNode<T> node, T value) {
        if (node == null) {
            return null;
        }
        int cmp = value.compareTo(node.getValue());
        if (cmp == 0) {
            return node;
        } else if (cmp > 0) {
            return getCeilingNode(node.getRight(), value);
        } else {
            BinaryTree.TreeNode<T> res = getCeilingNode(node.getLeft(), value);
            return (res != null) ? res : node;
        }
    }
}


