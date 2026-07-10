class Solution {
    public void rotate(int[] nums, int k) {
    List<Integer> l= new ArrayList<>();
    k=k%nums.length;
    for(int i=nums.length-k;i<nums.length;i++){
        l.add(nums[i]);
    }
    for(int i=nums.length-k-1;i>=0;i--){
        nums[i+k]=nums[i];
    }
    for(int i=0;i<l.size();i++){
        nums[i]=l.get(i);
    }
    }
}