class Solution {
    public List<Integer> majorityElement(int[] nums) {
    Map<Integer, Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
    hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);    
    } 
    List<Integer> l= new ArrayList<>();
    for (int key : hash.keySet()) {
         if(hash.get(key)>nums.length/3){
            l.add(key);
         }
}
    return l;
    }
}