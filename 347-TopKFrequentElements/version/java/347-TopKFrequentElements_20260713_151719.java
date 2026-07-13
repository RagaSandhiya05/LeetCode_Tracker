// Last updated: 7/13/2026, 3:17:19 PM
1// Top K Frequent Elements
2class Solution {
3    public int[] topKFrequent(int[] nums, int k) {
4        HashMap<Integer , Integer> map = new HashMap<>();
5        for(int element : nums) {
6            map.put(element , map.getOrDefault(element , 0) + 1);
7        }
8        ArrayList<Map.Entry<Integer , Integer>> arr = new ArrayList<>(map.entrySet());
9        arr.sort((a , b) -> b.getValue() - a.getValue());
10        int last[] = new int[k];
11        for(int i = 0 ; i < k ; i++) {
12            last[i] = arr.get(i).getKey();
13        }
14        return last;
15    }
16}
17       