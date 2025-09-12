class Solution {
    public List<String> getLongestSubsequence(String[] words, int[] groups) {

     List<String> result = new ArrayList<>();
     if (words.length == 0) return result;
      
        int lastGroup = groups[0];
        for(int i=1;i<groups.length;i++){
            if(groups[i]!= groups[i-1]){
               result.add(words[i]);
               lastGroup = groups[i];
            }
        }

        return result;
    }
}
