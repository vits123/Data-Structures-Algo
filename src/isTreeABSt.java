
/*
 * Check if Binary tree is BST or not
 * Time complexity - O(n)
 * Space complexity - O(n)
 */



public class isTreeABSt {
	public static boolean isBinaryTreeBST(BinaryNode<Integer> tree) {
		return areKeysInRange(tree,Integer.MIN_VALUE,Integer.MAX_VALUE);
		
}

	private static boolean areKeysInRange(BinaryNode<Integer> tree, Integer lower, Integer upper) {
		if(tree==null) {
			return true;
		}else if(Integer.compare(tree.data, lower) < 0 || Integer.compare(tree.data, upper) > 0) {
			return false;
		}
		
		return areKeysInRange(tree.left,lower,tree.data) && areKeysInRange(tree.right, tree.data,upper );
		
	}



}