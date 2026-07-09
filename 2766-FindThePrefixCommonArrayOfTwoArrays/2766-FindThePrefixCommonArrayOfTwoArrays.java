// Last updated: 7/9/2026, 9:50:48 AM
// Find the Prefix Common Array of Two Arrays
class Solution {
    public int[] findThePrefixCommonArray(int[] A, int[] B) {
        int n = A.length;
        int freq[] = new int[n + 1];
        int ans[] = new int[n];
        int count = 0;
        for(int i = 0 ; i < n ; i++) {
            freq[A[i]]++;
            if(freq[A[i]] == 2)
            count++;
            freq[B[i]]++;
            if(freq[B[i]] == 2)
            count++;
            ans[i] = count;
        }
        return ans;
    }
}
     