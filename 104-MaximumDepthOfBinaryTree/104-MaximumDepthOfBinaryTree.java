// Last updated: 7/9/2026, 10:00:08 AM
class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null)return 0;
        else return Math.max(maxDepth(root.left),maxDepth(root.right))+1;
    }
}