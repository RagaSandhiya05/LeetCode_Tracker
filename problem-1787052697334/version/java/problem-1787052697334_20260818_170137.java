// Last updated: 8/18/2026, 5:01:37 PM
1// Find the Largest Almost Missing Integer
2import java.util.*;
3class Solution {
4    public int largestInteger(int[] nums, int k) {
5        Map<Integer, Integer> windowCount = new HashMap<>();
6        for (int start = 0; start <= nums.length - k; start++) {
7            Set<Integer> seen = new HashSet<>();
8            for (int i = start; i < start + k; i++) {
9                seen.add(nums[i]);
10            }
11            for (int value : seen) {
12                windowCount.put(value, windowCount.getOrDefault(value, 0) + 1);
13            }
14        }
15        int answer = -1;
16        for (Map.Entry<Integer, Integer> entry : windowCount.entrySet()) {
17            if (entry.getValue() == 1) {
18                answer = Math.max(answer, entry.getKey());
19            }
20        }
21        return answer;
22    }
23}