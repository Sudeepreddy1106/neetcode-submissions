class Solution {
    public int[] getConcatenation(int[] nums) {
    int [] inte = new int[nums.length*2];
    for(int i=0;i<nums.length;i++){
        inte[i]=nums[i];
    }
        for(int i=0;i<nums.length;i++){
        inte[i+nums.length]=nums[i];
    }
    return inte;
    }
}