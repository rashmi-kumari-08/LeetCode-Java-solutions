class Solution {
    public boolean uniqueOccurrences(int[] arr) {
         HashMap<Integer,Integer> hashMap = new HashMap<>();
        for(int n: arr){
            int count = hashMap.getOrDefault(n,0);
            hashMap.put(n,count+1);
        }
        HashSet<Integer> hashSet = new HashSet<>();
        for(int c: hashMap.values()){
            hashSet.add(c);
        }
        return hashSet.size()== hashMap.size();
    }
}
