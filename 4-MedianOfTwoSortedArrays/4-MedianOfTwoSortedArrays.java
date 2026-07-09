// Last updated: 7/9/2026, 10:02:23 AM
class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int l1 = nums1.length;
        int l2 = nums2.length;
        int[] newNum = new int[l1+l2];

        for(int i=0; i<l1; i++){
            newNum[i] = nums1[i];
        }
        for(int j=0; j<l2; j++){
            newNum[l1+j] = nums2[j];
        }
        
        Arrays.sort(newNum);
        
        double median;
        int n = newNum.length;
        
        if(n % 2 == 1){
            median = newNum[n / 2];
        }
        else{
            median = (newNum[(n/2)-1] + newNum[n/2]) / 2.0;
        }   

        return median;   
    }
}