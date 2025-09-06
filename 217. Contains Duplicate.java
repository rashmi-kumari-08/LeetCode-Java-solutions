//Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
//Example Input: nums = [1,2,3,1]  Output: true

class Solution {
  
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return true; // Found duplicate → return immediately
            }
            set.add(num);
        }

        return false; // No duplicates found
    }
}
