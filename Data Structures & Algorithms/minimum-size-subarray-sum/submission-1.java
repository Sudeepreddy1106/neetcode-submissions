class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int min = 999999;
        int left = 0;
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            sum = sum + nums[i];
            while (sum >= target) {
                min = Math.min(min, i - left);
                sum = sum - nums[left];
                left++;
            }
        }
        if (min == 999999) {
            return 0;
        }
        return min + 1;
    }
}