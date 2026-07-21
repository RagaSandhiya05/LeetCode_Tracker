// Last updated: 7/21/2026, 4:12:43 PM
1class Solution {
2    public int maxActiveSectionsAfterTrade(String s) {
3        char[] arr = s.toCharArray();
4        int n = arr.length;
5        int count1 = 0;
6        int block1 = 0;
7        int block2 = 0;
8        int maxx = 0;
9        int i = 0;
10        while(i < n){
11            char ch = arr[i];
12            if(ch == '0') {
13                block1++;
14                i++;
15            }
16            else{
17                while(i < n && arr[i] == '1'){
18                    i++;
19                    count1++;
20                } 
21                while(i < n && arr[i] == '0'){
22                    i++;
23                    block2++;
24                }
25                if(block1 != 0 && block2 != 0) maxx = Math.max(maxx , block1 + block2);
26                block1 = block2;
27                block2 = 0;
28            }
29        }
30        return count1 + maxx;
31    }
32}