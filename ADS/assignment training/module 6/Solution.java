import java.util.*;

/**
 * implementation of BST
 * 
 * @author Manisha
 */

public class Solution {
    Node parent;

    public boolean isInRange() {
        return isBST(parent, Integer.MIN_VALUE, Integer.MAX_VALUE);

    }

    public boolean isBST(Node node, int mini, int max) {
        // System.out.println(mini);
        // System.out.println(max);
        if (node == null)
            return true;
        if (node.val < mini || node.val > max)
            return false;
        return (isBST(node.l, mini, node.val - 1) && isBST(node.r, node.val + 1, max));

    }

    public static void main(String args[]) {
        Solution s = new Solution();
        s.parent = new Node(5);
        s.parent.l = new Node(3);
        s.parent.r = new Node(6);
        s.parent.l.l = new Node(2);
        s.parent.l.r = new Node(4);
        // System.out.println(s.mini);
        // System.out.println(s.max);
        if (s.isInRange()) {
            System.out.println("true");
        } else
            System.err.println("false");

    }
}