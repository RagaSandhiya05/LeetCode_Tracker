// Last updated: 7/9/2026, 9:59:59 AM
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
class Solution 
{
    static boolean b;
    public static int isbal(TreeNode root)
    {
        if(root == null)
            return 0;
        int h1=isbal(root.left);
        int h2=isbal(root.right);
        if(Math.abs(h1-h2) > 1)
            b=false;
        return Math.max(h1+1,h2+1);
    }
    public boolean isBalanced(TreeNode root) 
    {
        b=true;
        int r=isbal(root);
        return b;
    }
}