// Last updated: 7/9/2026, 9:58:15 AM
// Valid Anagram
class Solution {
    public boolean isAnagram(String s, String t) {
        char arr1[] = s.toCharArray();
        char arr2[] = t.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        if(Arrays.equals(arr1 , arr2)){
            return true;
        }
        return false;
    }
}