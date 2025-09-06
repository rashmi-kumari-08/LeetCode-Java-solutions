class Solution {
    public boolean rotateString(String s, String goal) {
           if(s.length()!=goal.length()) return false;
            String string = s+ s;
        for(int i=0;i<s.length();i++){
            if(string.substring(i,s.length()+i).equals(goal)) return true;
        }

        return false;
    }
}
