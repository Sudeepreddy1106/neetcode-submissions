class Solution {
    public int[] productExceptSelf(int[] nums) {
    int product= 1;
    int prx=1;
    int sfx=1;
    int []pr= new int[nums.length];
    int []sf= new int[nums.length];
    int j=nums.length-1;
    for(int i=0;i<nums.length;i++){
        prx=prx*nums[i];
        pr[i]=prx;
        sfx=sfx*nums[j];
        sf[j]=sfx;
        j--;
    }  
    int []output=new int[nums.length];
    for(int i=0;i<nums.length;i++){
        if(i==0){
            output[i]=sf[i+1];
        }
        else if(i==nums.length-1){
            output[i]=pr[i-1];
        }
        else{
            output[i]=pr[i-1]*sf[i+1];
        }
    }
    return output;
    }
}  
