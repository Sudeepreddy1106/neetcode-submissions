class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> hash = new HashMap<>();
        boolean valid=false;
        for (int i = 0; i < nums.length; i++) {
            if (hash.containsKey(nums[i])) {
                if (Math.abs(hash.get(nums[i]) - i) <= k) {
                    valid = true;
                }
            }
            hash.put(nums[i],i);
        }
        return valid;
    }
}