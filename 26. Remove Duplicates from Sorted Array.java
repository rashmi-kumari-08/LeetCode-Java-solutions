//Example Input: nums = [1,1,2] Output: 2, nums = [1,2,_]
//Explanation: Your function should return k = 2, with the first two elements of nums being 1 and 2 respectively.
//It does not matter what you leave beyond the returned k (hence they are underscores).
class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        if (n == 0) return 0; // quick edge case

        int i = 0; 
        for (int j = 1; j < n; j++) {
            if (nums[j] != nums[i]) {
                nums[++i] = nums[j]; // pre-increment + assignment in one step
            }
        }
        return i + 1;
    }
}
