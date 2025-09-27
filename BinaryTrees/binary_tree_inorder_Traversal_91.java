import java.util.ArrayList;
import java.util.List;


// Definition for a binary tree node.
public class binary_tree_inorder_Traversal_91 {
    int val;
    binary_tree_inorder_Traversal_91 left;
    binary_tree_inorder_Traversal_91 right;
    binary_tree_inorder_Traversal_91() {}
    binary_tree_inorder_Traversal_91(int val) { this.val = val; }
    binary_tree_inorder_Traversal_91(int val, binary_tree_inorder_Traversal_91 left, binary_tree_inorder_Traversal_91 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public List<Integer> inorderTraversal(binary_tree_inorder_Traversal_91 root) {
        List<Integer> result = new ArrayList<>();
        inorderHelper(root, result);
        return result; 
    }
    
    private void inorderHelper(binary_tree_inorder_Traversal_91 root, List<Integer> result) {
        if (root == null) {return; }
        inorderHelper(root.left, result);
        result.add(root.val);
        inorderHelper(root.right, result);
    }
}