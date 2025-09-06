class Solution {
    public int distributeCandies(int[] candyType) {
        HashSet<Integer> hashSet = new HashSet<>();
        int half = candyType.length/2;
        for(int i: candyType){
            hashSet.add(i);
        }
        return Math.min(hashSet.size(), half);
    }
}
