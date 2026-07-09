// Last updated: 7/9/2026, 9:55:31 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int len = strs[0].length();
        int count = 0;
        for(int j = 0 ; j < len ; j++){
            for(int i = 1 ; i < n ; i++){
                if(strs[i-1].charAt(j) > strs[i].charAt(j)){
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
                