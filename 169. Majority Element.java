
//Optimal
class Solution {
    public int majorityElement(int[] nums) {

       HashMap<Integer, Integer> hashmap = new HashMap<>();
    int max = 0;
    int result = 0;

    for (int num : nums) {
        int count = hashmap.getOrDefault(num, 0) + 1;
        hashmap.put(num, count);

        if (count > max) {
            max = count;
            result = num;
        }
    }

    return result;
    }
}
// Brute force 
class Solution {
    public int majorityElement(int[] nums) {
        
       HashMap<Integer,Integer> hashmap = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int count = hashmap.getOrDefault(nums[i],0);
            hashmap.put(nums[i],count+1);
        }
        int max =0;
        int result=0;
        for(Map.Entry<Integer,Integer> m: hashmap.entrySet()){
            if(m.getValue()> max){
                max = m.getValue();
                result = m.getKey();
            }
        }
        return  result;
    }
}
