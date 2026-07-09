// Last updated: 7/9/2026, 9:50:12 AM
class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int count =s1.length()+s2.length()+s3.length();
        int tempcount=count;
        for(int i=0;i<s1.length();i++){
            if(i<s2.length() && i<s3.length()){
                char c1 = s1.charAt(i);
                char c2 = s2.charAt(i);
                char c3 = s3.charAt(i);
                if(c1==c2 && c2==c3) tempcount-=3;
                else break;
            }
        }
        return count==tempcount?-1:tempcount;
    }
}