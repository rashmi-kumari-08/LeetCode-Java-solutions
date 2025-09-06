class Solution {
   public String reverseOnlyLetters(String s) {
    char[] ch = s.toCharArray();
    char[] rev = new char[s.length()];
    int start = 0;
    int end = s.length() - 1;

    while (start < s.length()) {
        if (Character.isLetter(ch[start])) {
            // move end pointer until it finds a letter
            while (end >= 0 && !Character.isLetter(ch[end])) {
                end--;
            }
            rev[start] = ch[end];
            end--;
        } else {
            rev[start] = ch[start];
        }
        start++;
    }
    return new String(rev);
}
}
