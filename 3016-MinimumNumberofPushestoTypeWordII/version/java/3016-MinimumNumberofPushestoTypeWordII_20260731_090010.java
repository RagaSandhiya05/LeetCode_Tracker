// Last updated: 7/31/2026, 9:00:10 AM
1// Minimum Number of Pushes to Type Word II
2class Solution {
3    public int minimumPushes(String word) {
4        int freq[] = new int[26];
5        for(char ch : word.toCharArray()) {
6            freq[ch - 'a']++;
7        }
8        Arrays.sort(freq);
9        int totalPushes = 0;
10        int distinctCount = 0;
11        for(int i = 25 ; i >= 0 ; i--) {
12            if(freq[i] == 0) 
13                break;
14                int pushMultiplier = (distinctCount / 8) + 1;
15                totalPushes = totalPushes + freq[i] * pushMultiplier;
16                distinctCount++;
17        }
18        return totalPushes;
19    }
20}