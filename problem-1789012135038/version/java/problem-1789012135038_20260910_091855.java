// Last updated: 9/10/2026, 9:18:55 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16
17// Count Nodes Equal to Average of Subtree
18class Solution {
19    private int answer = 0;
20    private int[] dfs(TreeNode node) {
21        if(node == null) {
22            return new int[]{0 , 0};
23        }
24        int left[] = dfs(node.left);
25        int right[] = dfs(node.right);
26        int sum = left[0] + right[0] + node.val;
27        int count = left[1] + right[1] + 1;
28        if(node.val == sum / count) {
29            answer++;
30        }
31        return new int[]{sum , count};
32        }
33    public int averageOfSubtree(TreeNode root) {
34        dfs(root);
35        return answer;
36    }
37}