class Solution {
    public int countBinarySubstrings(String s) {
        
        int pg =0;
        int cg =1;
        int count =0;

        for(int i=1;i<s.length();i++){
            
            if(s.charAt(i)==s.charAt(i-1)){
                cg++;
            }else{
                count += Math.min(pg,cg);
                pg = cg;
                cg =1;
            }
        }
        count += Math.min(pg,cg);

        return count;

    }
}
