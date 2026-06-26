class Solution {
    public int[] twoSum(int[] nums, int target) {
    int [] output= new int[2];
    Map<Integer, Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
    int num1=nums[i];
    int num2=target-nums[i];
    if(hash.containsKey(num2)){
        output[1]=i;
        output[0]=hash.get(num2);
        break;
    }    
    hash.put(num1,i);
    }    
    return output;
    }
}
