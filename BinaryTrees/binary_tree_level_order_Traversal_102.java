import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;


// Definition for a binary tree node.
public class binary_tree_level_order_Traversal_102 {
    int val;
    binary_tree_level_order_Traversal_102 left;
    binary_tree_level_order_Traversal_102 right;
    binary_tree_level_order_Traversal_102() {}
    binary_tree_level_order_Traversal_102(int val) { this.val = val; }
    binary_tree_level_order_Traversal_102(int val, binary_tree_level_order_Traversal_102 left, binary_tree_level_order_Traversal_102 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
 }
 
class Solution {
    public List<List<Integer>> levelOrder(binary_tree_level_order_Traversal_102 root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) return res;

        Queue<binary_tree_level_order_Traversal_102> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int qlen = q.size();
            List<Integer> level = new ArrayList<>();

            for (int i = 0; i < qlen; i++) {
                binary_tree_level_order_Traversal_102 node = q.poll();
                if (node != null) {
                    level.add(node.val);
                    if (node.left != null) q.add(node.left);
                    if (node.right != null) q.add(node.right);
                }
            }
            if (!level.isEmpty()) res.add(level);
        }
        return res;
    }
}