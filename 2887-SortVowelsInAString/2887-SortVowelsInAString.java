// Last updated: 7/9/2026, 9:50:39 AM
class Solution {
    public String sortVowels(String s) {
        char arr[]= s.toCharArray();
        List<int[]> list = new ArrayList<>();
        String str="aeiouAEIOU";
        Set<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            char ch=arr[i];
            if(str.indexOf(ch)!=-1){
                int val=(int)ch;
                list.add(new int[]{val,i});
                set.add(i);
            }
        }

        Collections.sort(list, (a,b)->a[0]-b[0]);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(set.contains(i)){
                char c=(char) list.get(j)[0];
                arr[i]=c;
                j++;
            }
        }
        return new String(arr);


    }
}