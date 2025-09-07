class Solution {
    public boolean detectCapitalUse(String word) {
         char[] ch = word.toCharArray();
            int count1=1;
             int count2=1;
             int count3=0;

        if((ch[0]>=65) && (ch[0]<= 90)){
            for(int i=1;i<ch.length;i++){
                if((ch[i]>=65) && (ch[i]<= 90)){
                    count1++;
                }else if((ch[i]>=97) && (ch[i]<= 122)){
                    count2++;
                }
            }
        }else{
            for(int i=0;i<ch.length;i++){
                if((ch[i]>=97) && (ch[i]<= 122)){
                    count3++;
                }
            } 
        }

        return count1==word.length()|| count2==word.length()|| count3==word.length();
    }
}
