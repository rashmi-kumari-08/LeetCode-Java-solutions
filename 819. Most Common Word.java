class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        paragraph = paragraph.toLowerCase().replaceAll("[^a-z]", " ");

        // 2. Split into words
        String[] str = paragraph.split("\\s+");
        HashMap<String,Integer> hashMap = new HashMap<>();
        Set<String> bannedSet = new HashSet<>(Arrays.asList(banned));

        for(String s: str){
            if(!bannedSet.contains(s)){
                int count = hashMap.getOrDefault(s,0)+1;
                hashMap.put(s,count);
            }
            
        }
        String common=str[0];
        int max =0;
         for(Map.Entry<String,Integer> map: hashMap.entrySet()){
            if(max < map.getValue()){
                 max = map.getValue();
                common= map.getKey();
            }
         }   
    return common;
    
    }
}
