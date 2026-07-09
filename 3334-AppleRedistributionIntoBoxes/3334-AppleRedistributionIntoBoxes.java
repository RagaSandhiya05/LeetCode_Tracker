// Last updated: 7/9/2026, 9:49:46 AM
class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        Arrays.sort(capacity);
        int sum = 0;
        for(int a : apple){
            sum = sum + a;
        }
        int ans = 0 , i = capacity.length-1;
        while(sum > 0){
            ans = ans + 1;
            sum = sum - capacity[i--];
        }
        return ans;
    }
}
       