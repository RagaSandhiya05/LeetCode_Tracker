// Last updated: 7/12/2026, 2:30:57 PM
1// Rank Transform of an Array
2class Solution {
3    public int[] arrayRankTransform(int[] arr) {
4        HashMap<Integer , Integer> map = new HashMap<>();
5        int nums[] = new int[arr.length];
6        for(int i = 0 ; i < arr.length ; i++) {
7            nums[i] = arr[i];
8        }
9        Arrays.sort(nums);
10        int rank = 1;
11        for(int num : nums) {
12            if(!map.containsKey(num)) {
13                map.put(num , rank++);
14            }
15        }
16        for(int i = 0 ; i < arr.length ; i++) {
17            nums[i] = map.get(arr[i]);
18        }
19        return nums;
20    }
21}
22       