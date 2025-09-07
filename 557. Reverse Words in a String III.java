class Solution {
    public String reverseWords(String s) {

        StringBuilder stringBuilder = new StringBuilder();

        String[] arr = s.split(" ");

        for(int i=0;i< arr.length;i++){
         stringBuilder.append(reverseSingleWord(arr[i].toCharArray()));
            if (i < arr.length - 1) { 
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    private String reverseSingleWord(char[] ch){

        int left =0;
        int right = ch.length-1;

            while(left<right){
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
        return String.valueOf(ch);
    
    }
}
