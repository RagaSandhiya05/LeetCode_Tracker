// Last updated: 7/24/2026, 11:28:38 AM
1// Number of Unique XOR Triplets
2import java.util.*;
3class Solution {
4    public int uniqueXorTriplets(int[] nums) {
5        int n = nums.length;
6        if (n == 1) return 1;
7        HashSet<Integer> pairXor = new HashSet<>();
8        for (int i = 0 ; i < n ; i++) {
9            for (int j = i + 1 ; j < n ; j++) {
10                pairXor.add(nums[i] ^ nums[j]);
11            }
12        }
13        BitSet ans = new BitSet(2048);
14        for (int x : nums)
15            ans.set(x);
16        for (int p : pairXor) {
17            for (int x : nums) {
18                ans.set(p ^ x);
19            }
20        }
21        return ans.cardinality();
22    }
23}