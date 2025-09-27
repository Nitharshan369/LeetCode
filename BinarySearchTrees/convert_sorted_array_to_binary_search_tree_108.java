package BinarySearchTrees;

// Definition for a binary tree node.
public class convert_sorted_array_to_binary_search_tree_108 {
    int val;
    convert_sorted_array_to_binary_search_tree_108 left;
    convert_sorted_array_to_binary_search_tree_108 right;

    convert_sorted_array_to_binary_search_tree_108() {
    }

    convert_sorted_array_to_binary_search_tree_108(int val) {
        this.val = val;
    }

    convert_sorted_array_to_binary_search_tree_108(int val, convert_sorted_array_to_binary_search_tree_108 left, convert_sorted_array_to_binary_search_tree_108 right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

class Solution {
    public convert_sorted_array_to_binary_search_tree_108 sortedArrayToBST(int[] nums) {
        return helper(nums, 0, nums.length - 1);
    }

    private convert_sorted_array_to_binary_search_tree_108 helper(int[] nums, int left, int right) {
        if (left > right)
            return null;

        int mid = (left + right) / 2;
        convert_sorted_array_to_binary_search_tree_108 root = new convert_sorted_array_to_binary_search_tree_108(nums[mid]);

        root.left = helper(nums, left, mid - 1);
        root.right = helper(nums, mid + 1, right);

        return root;
    }
}