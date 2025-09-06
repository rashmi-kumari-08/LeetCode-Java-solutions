class Solution {
    public boolean canBeIncreasing(int[] nums) {
     int prev =nums[0];
        int flag=0;

        for(int i=1;i<nums.length;i++){
            if(nums[i]<=prev){
                flag++;
                if(flag>1) return false;
                if(i==1 ||nums[i]>nums[i-2]){
                    prev = nums[i];
                }

            }else
                prev = nums[i];
        }
        return true;
    }
}
