// Last updated: 7/9/2026, 10:00:01 AM
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode create(int[] nums , int st , int end) {
        if (st > end) 
        return null;
        int mid = st + (end - st) / 2;
        TreeNode n = new TreeNode(nums[mid]);
        n.left = create(nums , st , mid - 1);
        n.right = create(nums , mid + 1 , end);
        return n;
    }
    public TreeNode sortedArrayToBST(int[] nums) {
        return create(nums , 0 , nums.length - 1);
        
    }
}