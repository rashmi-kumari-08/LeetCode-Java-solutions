class Solution {
    public int[] getConcatenation(int[] nums) {
        int[] newarray = new int[nums.length*2];
        for(int i=0;i<nums.length;i++){
            newarray[i] = nums[i];
        }
        int count=0;
        for(int i=nums.length;i<nums.length*2;i++){
            newarray[i] = nums[count];
            count++;
        }

        return newarray;

    }
}
