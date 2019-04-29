import java.util.Collection;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeByLevel {
	
	public List<BinaryNode> getUsingQueue(BinaryNode root){
		validateBinaryNode(root);
		
		List<BinaryNode> result= new LinkedList<BinaryNode>();
		Queue<BinaryNode> queue = new LinkedList<BinaryNode>();
		queue.add(root);
		while(!queue.isEmpty()) {
			BinaryNode binaryNode=queue.remove();
			result.add(binaryNode);
			if(binaryNode.getLeft()!=null) {
				queue.add(binaryNode.getLeft());
			}
			if(binaryNode.getRight()!=null) {
				queue.add(binaryNode.getRight());
			}
		
		}
		return result;
		
	}	
		
	public List<BinaryNode> getWithoutAdditionalDataStructures(BinaryNode root){
		validateBinaryNode(root);
		List<BinaryNode> result=new LinkedList<BinaryNode>();
		int depth=getDepth(root);
		for(int i=1;i<=depth;i++) {
			result.addAll(getNodesForLevel(root,i));
		}
		return result;
		
	}
		
		
		
	

	private List<BinaryNode> getNodesForLevel(BinaryNode root, int level) {
		if(root == null) {
			return Collections.EMPTY_LIST;
		}else {
			List<BinaryNode> result=new LinkedList<BinaryNode>();
			//StringBuilder stringBuilder=new stringBuilder();
			if(level==1) {
				result.add(root);
			}else {
				result.addAll(getNodesForLevel(root.getLeft(),level-1));
				result.addAll(getNodesForLevel(root.getRight(),level-1));
			}
			return result;
		}
	
	}

	private int getDepth(BinaryNode root) {
		if(root==null) {
			return 0;
		}else {
			return 1 + Math.max(getDepth(root.getLeft()),getDepth(root.getRight()));
		}
		}

	private void validateBinaryNode(BinaryNode root) {
		if(root==null) {
			throw new IllegalArgumentException("Can't use null binarynodes");
		}
		
	}
	

}
