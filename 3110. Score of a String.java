class Solution {
   public  int scoreOfString(String s) {
        char[] ch = s.toCharArray();
        int sum =0;

        for(int i =1;i<s.length();i++){
            sum += Math.abs((int)ch[i-1]  -(int)ch[i]);
        }
        return sum;
    }
}
