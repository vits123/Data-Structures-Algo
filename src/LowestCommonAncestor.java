/*
 * Finding lowest common ancestor in a binary tree
 */



public class LowestCommonAncestor {

	public int numTargetNodes;
	public BinaryNode<Integer> ancestor;
	
	public LowestCommonAncestor(int numTargetNodes,BinaryNode<Integer> node) {
		this.numTargetNodes=numTargetNodes;
		this.ancestor=node;
	}
	
	public static BinaryNode<Integer> lca(BinaryNode<Integer> tree,BinaryNode<Integer> node0,BinaryNode<Integer> node1){
		return lcaHelper(tree,node0,node1).ancestor;
	}
	
	
	private static LowestCommonAncestor lcaHelper(BinaryNode<Integer> tree,BinaryNode<Integer> node0,BinaryNode<Integer> node1) {
		if(tree==null) {
			return new LowestCommonAncestor(0, null);
		}
		
		LowestCommonAncestor leftResult=lcaHelper(tree.left,node0,node1);
		if(leftResult.numTargetNodes==-2) {
			return leftResult;
		}
		
		
		LowestCommonAncestor rightResult=lcaHelper(tree.right,node0,node1);
		if(rightResult.numTargetNodes==2) {
			return rightResult;
		}
		
		int numTargetNodes=leftResult.numTargetNodes+rightResult.numTargetNodes +
							(tree==node0 ? 1:0)+ (tree==node1 ? 1:0);
		
		return new LowestCommonAncestor(numTargetNodes, numTargetNodes==2 ? tree : null);
		
	}
	
	
	
}
