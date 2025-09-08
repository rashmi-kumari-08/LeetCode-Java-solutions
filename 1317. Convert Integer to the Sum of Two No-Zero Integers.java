class Solution {
    public int[] getNoZeroIntegers(int n) {

        int[] result = new int[2];
        for(int i=1;i<n;i++){
            int diff = n-i;
            if(checknonzero(i)&& checknonzero(diff)){
                result[0]=i;
                result[1]= diff;
                break;
            }
        }
            return result;
    }
    private boolean checknonzero(int n){

        while(n>0){
            if(n%10==0) return false;
            n= n/10;
        }
        return true;

    }
}
