
public class isTreeBalanced {

	public static boolean check(BinaryNode root) {
		if(root==null) {
			return true;
		}else {
			int heightDiff=getRootHeight(root.getLeft())-getRootHeight(root.getRight());
			return Math.abs(heightDiff) <=1;
		}
	}
	
	private static int getRootHeight(BinaryNode tree) {
		if(tree==null) {
			return 0;
		}else {
			return 1+ Math.max(getRootHeight(tree.getLeft()),getRootHeight(tree.getRight()));
		}
	}
	
	
}
