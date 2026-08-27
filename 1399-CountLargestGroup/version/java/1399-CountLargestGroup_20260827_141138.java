// Last updated: 8/27/2026, 2:11:38 PM
1// Count Largest Group
2class Solution {
3    public int countLargestGroup(int n) {
4        Map<Integer , Integer> map = new HashMap<>();
5        int MaxSize = 0;
6        for(int i = 1 ; i <= n ; i++) {
7            int sum = 0;
8            int num = i;
9            while(num > 0) {
10                sum = sum + num % 10;
11                num = num / 10;
12            }
13            map.put(sum , map.getOrDefault(sum , 0) + 1);
14            MaxSize = Math.max(MaxSize , map.get(sum));
15        }
16        int count = 0;
17        for(int val : map.values()) {
18            if(val == MaxSize)
19            count++;
20        }
21        return count;
22    }
23}
24        