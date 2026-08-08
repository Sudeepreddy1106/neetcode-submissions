class Solution {
    public int specialArray(int[] nums) {
        int x=-1;
        int g=0;
        int min=9999;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(int i=0;i<=1000;i++){
             g=0;
            for(int j=0;j<nums.length;j++){
                if(nums[j]>=i){
                    g++;
                }
            }
            if(i==g){
                x=i;
                return x;
            }
        }
        return -1;
    }
}