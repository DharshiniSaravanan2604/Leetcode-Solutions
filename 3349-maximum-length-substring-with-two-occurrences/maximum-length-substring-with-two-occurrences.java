class Solution {
    public int maximumLengthSubstring(String s) {
        int[] count = new int[26];
        int l = 0; 
        int max = 0;
        for(int r = 0; r < s.length(); r++){
            char rightChar = s.charAt(r);
            count[rightChar - 'a']++;

            while( count[rightChar - 'a'] > 2){
                char leftChar = s.charAt(l);
                count[leftChar - 'a']--;
                l++;
            }
            max = Math.max(max, r - l + 1);
        }
        return max;
    }
}