class Solution {
    public int subarraySum(int[] nums, int k) {
        Map<Integer,Integer>seen= new HashMap<>();
        seen.put(0,1);
        int ps=0;
        int count=0;
        for(int i=0;i<nums.length;i++){
            ps=ps+nums[i];
            if(seen.containsKey(ps-k)){
                count=count+seen.get(ps-k);
                seen.put(ps,seen.getOrDefault(ps,0)+1);
            }
            else{
                seen.put(ps,seen.getOrDefault(ps,0)+1);
            }
        }
        return count; 
    }
}