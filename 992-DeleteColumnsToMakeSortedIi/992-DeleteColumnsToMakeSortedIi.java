// Last updated: 7/9/2026, 9:55:30 AM
class Solution {
    public int minDeletionSize(String[] strs) {
        int n = strs.length;
        int m = strs[0].length();
        boolean[] sorted = new boolean[n-1];
        int deletions = 0;
        for(int j = 0 ; j < m ; j++){
            boolean needDelete = false;
            for(int i = 0 ; i < n - 1 ; i++){
                if(!sorted[i] && strs[i].charAt(j) > strs[i+1].charAt(j)) {
                    needDelete = true;
                    break;
                }
            }
            if(needDelete){
                deletions++;
            }
            else {
                for(int i = 0 ; i < n - 1 ; i++){
                    if(!sorted[i] && strs[i].charAt(j) < strs[i+1].charAt(j)){
                        sorted[i] = true;
                    }
                }
            }
        }
        return deletions;
    }
}
                    