class Solution {
    //int[] nums = [2,7,11,15], target = 9

    public int[] twoSum(int[] nums, int target) {
        
    // Create a map to store numbers and their indices 
        HashMap<Integer,Integer> hashmap = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            // Find the complement
            int diff = target - nums[i];
            // if the complement exists, return the indices
            if(hashmap.containsKey(diff)){
                return new int[]{hashmap.get(diff),i};
            }
            //Store the current number with index
            hashmap.put(nums[i],i);
            
        }
        return new int[]{};

    }
}
