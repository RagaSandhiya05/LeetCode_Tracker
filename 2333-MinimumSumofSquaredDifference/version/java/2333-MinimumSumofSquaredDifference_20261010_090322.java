// Last updated: 10/10/2026, 9:03:22 AM
1// Minimum Sum of Squared Difference
2class Solution {
3    public long minSumSquareDiff(int[] nums1, int[] nums2, int k1, int k2) {
4        int n = nums1.length;
5        int[] diff = new int[n];
6        long k = (long) k1 + k2;
7        long total = 0;
8        int maxDiff = 0;
9
10        for (int i = 0; i < n; i++) {
11            diff[i] = Math.abs(nums1[i] - nums2[i]);
12            total += diff[i];
13            maxDiff = Math.max(maxDiff, diff[i]);
14        }
15
16        if (total <= k) {
17            return 0;
18        }
19
20        int left = 0, right = maxDiff;
21        while (left < right) {
22            int mid = left + (right - left) / 2;
23            long operations = 0;
24            
25            for (int d : diff) {
26                if (d > mid) {
27                    operations += d - mid;
28                }
29            }
30            
31            if (operations <= k) {
32                right = mid;
33            } else {
34                left = mid + 1;
35            }
36        }
37
38        int threshold = left;
39        long remaining = k;
40        
41        for (int d : diff) {
42            if (d > threshold) {
43                remaining -= d - threshold;
44            }
45        }
46
47        long result = 0;
48        for (int d : diff) {
49            d = Math.min(d, threshold);
50            
51            if (d == threshold && remaining > 0) {
52                d--;
53                remaining--;
54            }
55            
56            result += (long) d * d;
57        }
58
59        return result;
60    }
61}