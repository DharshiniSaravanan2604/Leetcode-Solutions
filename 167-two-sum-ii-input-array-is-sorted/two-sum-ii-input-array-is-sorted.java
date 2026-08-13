class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while (left < right) {
            int sum = numbers[left] + numbers[right];

            if (sum == target) {
                // Return 1-based indices as required
                return new int[]{left + 1, right + 1};
            } else if (sum < target) {
                left++;  // Sum is too small, move left pointer to increase sum
            } else {
                right--; // Sum is too large, move right pointer to decrease sum
            }
        }

        return new int[]{-1, -1};
        
    }
}