
public class BinaryNode<T> {

	 T data;
	BinaryNode<T> left;
	BinaryNode<T> right;
	
	
	public BinaryNode(T data) {
		this.data=data;
	}


	public BinaryNode<T> getLeft() {
		return left;
	}


	public void setLeft(BinaryNode<T> left) {
		this.left = left;
	}


	public BinaryNode<T> getRight() {
		return right;
	}


	public void setRight(BinaryNode<T> right) {
		this.right = right;
	}


	public T getData() {
		return data;
	}
	
	public boolean hasLeft() {
		return left!=null;
	}
	
	public boolean hasRight() {
		return right!=null;
	}
	
	@Override
	public boolean equals(Object o) {
		if(this==o)
			return true;
		if(!(o instanceof BinaryNode))
			return false;
		
		BinaryNode that = (BinaryNode) o;
		
		if(!data.equals(that.data))
			return false;
		if(left!=null ? !left.equals(that.left):that.left!=null)
			return false;
		if(right!=null ? !right.equals(that.right): that.right!=null)
			return false;
		
		return true;
	}
	
	public int hashCode() {
		int result=data.hashCode();
		result= 31* result + (left!=null ? left.hashCode():0);
		result= 31* result + (right!=null ? right.hashCode():0);
		return result;
	}
	
	public String toString() {
		return "BinaryNode{" + "data="+data+'}' ;
	}
}
