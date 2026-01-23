package binarysearchtree;
public class BinarySearchTree {

    Node root;

    // 1️⃣ Insert
    public Node insert(Node root, int key) {
        if (root == null) {
            return new Node(key);
        }

        if (key < root.key) {
            root.left = insert(root.left, key);
        } else if (key > root.key) {
            root.right = insert(root.right, key);
        }

        return root;
    }

    // 2️⃣ Search
    public boolean search(Node root, int key) {
        if (root == null) {
            return false;
        }

        if (key == root.key) {
            return true;
        }

        if (key < root.key) {
            return search(root.left, key);
        }

        return search(root.right, key);
    }

    // 3️⃣ In-order Traversal (Sorted Output)
    public void inorder(Node root) {
        if (root != null) {
            inorder(root.left);
            System.out.print(root.key + " ");
            inorder(root.right);
        }
    }

    // 4️⃣ Delete
    public Node delete(Node root, int key) {
        if (root == null) {
            return root;
        }

        if (key < root.key) {
            root.left = delete(root.left, key);
        } 
        else if (key > root.key) {
            root.right = delete(root.right, key);
        } 
        else {
            // Case 1: No child
            if (root.left == null)
                return root.right;

            if (root.right == null)
                return root.left;

            // Case 2: Two children
            root.key = minValue(root.right);
            root.right = delete(root.right, root.key);
        }

        return root;
    }

    // Helper method
    private int minValue(Node root) {
        int min = root.key;
        while (root.left != null) {
            min = root.left.key;
            root = root.left;
        }
        return min;
    }
