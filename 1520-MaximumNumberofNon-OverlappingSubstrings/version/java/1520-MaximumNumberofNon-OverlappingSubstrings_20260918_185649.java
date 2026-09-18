// Last updated: 9/18/2026, 6:56:49 PM
1// Maximum Number of Non-Overlapping Substrings
2class Solution {
3    public List<String> maxNumOfSubstrings(String s) {
4        int[] count = new int[26];
5        int[] first = new int[26];
6        int[] last = new int[26];
7
8        Arrays.fill(first, -1);
9        Arrays.fill(last, -1);
10
11        List<Integer> order = new ArrayList<>();
12
13        for (int i = 0; i < s.length(); i++) {
14            int c = s.charAt(i) - 'a';
15
16            if (count[c] == 0) {
17                first[c] = i;
18                order.add(c);
19            }
20
21            count[c]++;
22            last[c] = i;
23        }
24
25        List<String> res = new ArrayList<>();
26        Deque<int[]> queue = new ArrayDeque<>();
27
28        for (int c : order) {
29            queue.addFirst(new int[]{
30                first[c], last[c], count[c]
31            });
32
33            int left = Integer.MAX_VALUE;
34            int right = Integer.MIN_VALUE;
35            int total = 0;
36
37            for (int[] item : queue) {
38                total += item[2];
39                left = Math.min(left, item[0]);
40                right = Math.max(right, item[1]);
41
42                if (total == right - left + 1) {
43                    break;
44                }
45            }
46
47            if (total == right - left + 1) {
48                res.add(s.substring(left, right + 1));
49                queue.clear();
50            }
51        }
52
53        return res;
54    }
55}