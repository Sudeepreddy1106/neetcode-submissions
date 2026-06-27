class Solution {
    public int majorityElement(int[] nums) {
    int count=1;
    int num=nums[0];
    for(int i=1;i<nums.length;i++){
        if(nums[i]==num){
            count++;
        }
        else if(nums[i]!=num){
            count--;
            if(count<=0)
            num=nums[i];
        }
       
    }
    return num;
    }
}