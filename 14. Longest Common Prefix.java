class Solution {
    // Example: Input: ["flower","flow","flight"]  Output: "fl"

    public String longestCommonPrefix(String[] strs) {
        // Edge case: if input is null or empty, return empty string
        if (strs == null || strs.length == 0) return "";

        // Find the minimum length among all strings (longest possible prefix can't exceed it)
        int minLen = Integer.MAX_VALUE;
        for (String str : strs) {
            minLen = Math.min(minLen, str.length());
        }

        // Binary search between prefix length 1 and minLen
        int low = 1;
        int high = minLen;

        while (low <= high) {
            // Middle prefix length to test
            int middle = low + (high - low) / 2;

            // Check if all strings share a prefix of length "middle"
            if (isCommonPrefix(strs, middle)) {
                // If yes → try for a longer prefix
                low = middle + 1;
            } else {
                // If no → try for a shorter prefix
                high = middle - 1;
            }
        }

        // After binary search, (low + high) / 2 is the length of the longest common prefix
        return strs[0].substring(0, (low + high) / 2);
    }

    // Helper function to check if all strings share a common prefix of given length
    private boolean isCommonPrefix(String[] strs, int len) {
        // Take prefix of first string
        String str1 = strs[0].substring(0, len);

        // Check if every other string starts with this prefix
        for (int i = 1; i < strs.length; i++) {
            if (!strs[i].startsWith(str1)) {
                return false; // mismatch → not a common prefix
            }
        }
        return true; // all matched → valid common prefix
    }
}
