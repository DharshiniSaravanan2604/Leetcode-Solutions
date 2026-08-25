class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> s = new HashSet<>();
        for(int n : nums){
            s.add(n);
        }
        int mul = k;
        while(s.contains(mul)){
            mul += k;
        }
        return mul;
    }
}