class Solution {
    public int maxFreqSum(String s) {

        HashMap<Character,Integer> hashMap = new HashMap<>();
        char[] ch =s.toCharArray();
        for(int i=0;i<ch.length;i++){
            int count = hashMap.getOrDefault(ch[i],0);
            hashMap.put(ch[i],count+1);
        }

        int vowelsmax =0;
        int consonmax=0;
        for(Map.Entry<Character,Integer> map : hashMap.entrySet()){
           if(isVowels(map.getKey())){
               vowelsmax =  Math.max(vowelsmax,map.getValue());
           }else{
               consonmax =  Math.max(consonmax,map.getValue());
           }
        }
        return vowelsmax+consonmax;

    }

    public boolean isVowels(char ch){
        return "aeiou".indexOf(ch)!=-1;
    }
}
