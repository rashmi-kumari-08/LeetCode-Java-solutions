class Solution {
     public int hIndex(int[] citations) {
        int n = citations.length;
        int[] bucket = new int[n+1];
        for(int cit : citations){
            bucket[Math.min(cit, n)]++;
        }
        int papers = 0;
        for(int i = n;i>=0;i--){
            papers += bucket[i];
            if(papers >= i){
                return i;
            }
        }
        return 0;
    }
}
