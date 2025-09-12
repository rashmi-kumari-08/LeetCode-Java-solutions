// Optimized 

public boolean doesAliceWin(String s) {
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c) {
                case 'a','e','i','o','u':
                    return true;
            }
        }

        return false;
    }


//Brut force

class Solution {
    public boolean doesAliceWin(String s) {

        char[] ch = s.toCharArray();
        int count =0;
        for(int i=0;i<ch.length;i++){
            if(isVowels(ch[i])){
                count++;
            }
        }
        return count >0;
    }

    public boolean isVowels(char ch){
        return "AEIOUaeiou".indexOf(ch)!=-1;
    }
}
