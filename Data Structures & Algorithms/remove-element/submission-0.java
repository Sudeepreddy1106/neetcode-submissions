class Solution {
    public int removeElement(int[] nums, int val) {
        int count=0;
        int left=0;
         for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                count++;
            }
            if(nums[left]!=val){
                left++;
            }
            if(nums[i]!=val && i>left){
                int temp=nums[i];
                nums[i]=nums[left];
                nums[left]=temp;
                left++;
            }
         }
         return count;
    }
}