// Last updated: 8/20/2026, 9:01:35 AM
1// Distribute Elements Into Two Arrays I
2class Solution {
3    public int[] resultArray(int[] nums) {
4        int len = nums.length;
5        int arr1[] = new int[len];
6        int arr2[] = new int[len];
7        int index1 = 1;
8        int index2 = 1;
9        arr1[0] = nums[0];
10        arr2[0] = nums[1];
11        for(int i = 2 ; i < len ; i++) {
12            if(arr1[index1 - 1] > arr2[index2 - 1]) {
13                arr1[index1++] = nums[i];
14            }
15            else{
16                arr2[index2++] = nums[i];
17            }
18        }
19        System.arraycopy(arr1 , 0 , nums , 0 , index1);
20        System.arraycopy(arr2 , 0 , nums , index1 , index2);
21        return nums;
22    }
23}
24           