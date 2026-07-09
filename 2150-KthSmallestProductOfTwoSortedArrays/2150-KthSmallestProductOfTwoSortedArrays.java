// Last updated: 7/9/2026, 9:52:19 AM
class Solution {
    public long kthSmallestProduct(int[] nums1, int[] nums2, long k) {
        int m = nums1.length;
        int n = nums2.length;

        long p1 = (long) nums1[0] * nums2[0];
        long p2 = (long) nums1[0] * nums2[n - 1];
        long p3 = (long) nums1[m - 1] * nums2[0];
        long p4 = (long) nums1[m - 1] * nums2[n - 1];
        long l = Math.min(Math.min(p1, p2), Math.min(p3, p4));
        long r = Math.max(Math.max(p1, p2), Math.max(p3, p4));

        while (l <= r) {
            long mid = l + (r - l) / 2;
            if (count(nums1, nums2, mid) < k) {
                l = mid + 1;
            } else {
                r = mid - 1;
            }
        }

        return l;
    }

    private long count(int[] nums1, int[] nums2, long tar) {
        long c = 0;
        for (int i : nums1) {
            if (i == 0) {
                if (tar >= 0) {
                    c += nums2.length;
                }
                continue;
            }

            int l = 0, h = nums2.length - 1;
            while (l <= h) {
                int mid = l + (h - l) / 2;
                long p = (long) i * nums2[mid];

                if (p <= tar) {
                    if (i > 0) l = mid + 1;
                    else h = mid - 1;
                } else {
                    if (i > 0) h = mid - 1;
                    else l = mid + 1;
                }
            }

            c += (i > 0) ? l : (nums2.length - l);
        }
        return c;
    }
}