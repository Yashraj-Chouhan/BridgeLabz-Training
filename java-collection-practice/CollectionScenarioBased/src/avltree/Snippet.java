package avltree;

public class Snippet {
	    public static void main(String[] args) {
	
	        AVLTree avl = new AVLTree();
	
	        // Example data (players / events / patients)
	        int[] keys = {30, 20, 40, 10, 25, 50};
	
	        for (int k : keys) {
	            avl.root = avl.insert(avl.root, k);
	        }
	
	        System.out.print("Sorted Output: ");
	        avl.inorder(avl.root);
	    }
	}
	
}

