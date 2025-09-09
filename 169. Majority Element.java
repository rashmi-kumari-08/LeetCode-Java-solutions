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
