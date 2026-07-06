class Solution {
    public int longestConsecutive(int[] nums) {
    int max=0;
    int length;
    Set<Integer> s= new HashSet<>();
    for(int i=0;i<nums.length;i++){
        s.add(nums[i]);
    }
    for(int i=0;i<nums.length;i++){
        if (!s.contains(nums[i]-1)){
            length=1;
            while((s.contains(nums[i]+length))){
                length++;
            }
            max=Math.max(length,max);
        }
    }
    return max;
    }
}
