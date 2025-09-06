//Example Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
class Solution {
    public int removeDuplicates(int[] nums) {
       int count =1;
        for(int i=0;i<nums.length-1;i++){
                if(nums[i]!=nums[i+1]){
                    nums[count]=nums[i+1];
                    count++;
                }
        }
        return count;
  }
}
