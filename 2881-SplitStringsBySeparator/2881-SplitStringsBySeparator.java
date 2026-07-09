// Last updated: 7/9/2026, 9:50:40 AM
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> result = new ArrayList<>();
      
        for(String s : words)
        {
           String [] tempArray = s.split("["+separator+"]");
           for(String str : tempArray)
           {
            if(!str.isEmpty())
            {
                result.add(str);
            }
           }
           
        }
        return result;
    }
}