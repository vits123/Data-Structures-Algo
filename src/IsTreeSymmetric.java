/*
 * Check if binary tree is symmetric..
 * Hint: The definition of symmetry is recursive
 * 
 */



public class IsTreeSymmetric {
	
	public static boolean isSymmetric(BinaryNode<Integer> root) {
		return root==null || checkSymmetric(root.left, root.right);
	}
	
	private static boolean checkSymmetric(BinaryNode<Integer> subtree0, BinaryNode<Integer> subtree1) {
		if(subtree0 == null && subtree1 == null) {
			return true;
		}else if(subtree0 != null && subtree1 != null) {
			return subtree0.data==subtree1.data && 
					checkSymmetric(subtree0.getLeft(),subtree1.getRight()) &&
					checkSymmetric(subtree0.right,subtree1.left);
		}
		
		// one is null and other is not
		
	return false;
		
	}
	
	

}
