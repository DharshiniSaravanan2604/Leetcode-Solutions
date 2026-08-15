class Solution {
    public int longestSubsequence(int[] nums) {
        int t = 0;
        boolean hasnonzero = false;
        for(int n : nums){
            t ^= n;
            if(n != 0){
                hasnonzero = true;
            }
        }
        if(!hasnonzero){
            return 0;
        }
        return t != 0 ? nums.length : nums.length - 1;
    }
}