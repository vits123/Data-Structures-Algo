
public class checkBalanced {

	
  static class BalanceStatusWithHeight{
		public boolean balanced;
		public int height;
		
		public BalanceStatusWithHeight(boolean balanced,int height) {
			this.balanced=balanced;
			this.height=height;
		}
	}
	
  public static boolean isBalanced(BinaryNode<Integer> tree) {
		return checkBalanced(tree).balanced;
	}
	
	private static BalanceStatusWithHeight checkBalanced(BinaryNode<Integer> root) {
		if(root==null) {
			return new BalanceStatusWithHeight(true,-1);
		}
		
		BalanceStatusWithHeight leftResult= checkBalanced(root.getLeft());
		if(!leftResult.balanced) {
			return leftResult;
		}
		
		BalanceStatusWithHeight rightResult=checkBalanced(root.getRight());
		if(!rightResult.balanced) {
			return rightResult;
		}
		
		boolean isBalanced=Math.abs(leftResult.height-rightResult.height) <=1;
		int height=Math.max(leftResult.height,rightResult.height)+1;
		return new BalanceStatusWithHeight(isBalanced,height);
		
	}
	
	
}
