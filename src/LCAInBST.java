
public class LCAInBST {

  public static BinaryNode<Integer> computeLCA(BinaryNode<Integer> root, BinaryNode<Integer> s,
      BinaryNode<Integer> b) {

    BinaryNode<Integer> p = root;
    while (p.data < s.data || p.data > b.data) {
      while (p.data < s.data) {
        p = p.right;
      }
      while (p.data > b.data) {
        p = p.left;
      }

    }

    return p;
  }
}
