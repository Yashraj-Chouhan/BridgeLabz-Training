package binarysearchtree;

public class Snippet {
	    public static void main(String[] args) {
	
	        BinarySearchTree bst = new BinarySearchTree();
	
	        // 🔹 Insertion (Enrollment / Products / Tracks)
	        int[] values = {50, 30, 70, 20, 40, 60, 80};
	        for (int val : values) {
	            bst.root = bst.insert(bst.root, val);
	        }
	
	        // 🔹 In-order Traversal (Sorted List)
	        System.out.print("Sorted Data: ");
	        bst.inorder(bst.root);
	        System.out.println();
	
	        // 🔹 Search
	        int searchKey = 40;
	        if (bst.search(bst.root, searchKey)) {
	            System.out.println(searchKey + " found in BST");
	        } else {
	            System.out.println(searchKey + " not found in BST");
	        }
	
	        // 🔹 Deletion
	        bst.root = bst.delete(bst.root, 30);
	        System.out.print("After Deletion (30): ");
	        bst.inorder(bst.root);
	    }
	}
	
}

