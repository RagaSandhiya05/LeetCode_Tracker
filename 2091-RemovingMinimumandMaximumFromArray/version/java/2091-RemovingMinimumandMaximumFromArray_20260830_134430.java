// Last updated: 8/30/2026, 1:44:30 PM
1// Removing Minimum and Maximum From Array
2class Solution {
3    public int minimumDeletions(int[] nums) {
4        int n = nums.length;
5
6        int minIndex = 0;
7        int maxIndex = 0;
8
9        for (int i = 1; i < n; i++) {
10            if (nums[i] < nums[minIndex]) {
11                minIndex = i;
12            }
13
14            if (nums[i] > nums[maxIndex]) {
15                maxIndex = i;
16            }
17        }
18
19        int removeFromFront = Math.max(minIndex, maxIndex) + 1;
20
21        int removeFromBack = n - Math.min(minIndex, maxIndex);
22
23        int removeFromBothSides = Math.min(
24            minIndex + 1 + (n - maxIndex),
25            maxIndex + 1 + (n - minIndex)
26        );
27
28        return Math.min(
29            removeFromFront,
30            Math.min(removeFromBack, removeFromBothSides)
31        );
32    }
33}