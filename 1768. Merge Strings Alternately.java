class Solution {
    public String mergeAlternately(String word1, String word2) {
         char[] str1 = word1.toCharArray();
        char[] str2 = word2.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        int count =0;
        for(int i=0;i<str1.length+ str1.length;i++){
            if(i<str1.length && i<str2.length){
                stringBuilder.append(str1[i]).append(str2[i]);
            }
        }
        if(str2.length>str1.length){
            for( int i=str1.length;i<str2.length;i++){
                stringBuilder.append(str2[i]);
            }
        }
        if(str1.length>str2.length){
            for( int i=str2.length;i<str1.length;i++){
                stringBuilder.append(str1[i]);
            }
        }


    return stringBuilder.toString();
    }
}
