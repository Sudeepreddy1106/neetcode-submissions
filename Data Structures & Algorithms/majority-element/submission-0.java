class Solution {
    public int majorityElement(int[] nums) {
    Map<Integer, Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
    }    
    int max = Collections.max(hash.values()); 
    int elem=0;
    for(Map.Entry<Integer, Integer> h : hash.entrySet()){
        if(h.getValue()==max){
            elem=h.getKey();
        }
    }
    return elem;
    }
}