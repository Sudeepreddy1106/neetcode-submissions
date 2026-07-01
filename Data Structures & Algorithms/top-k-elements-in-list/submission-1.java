class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    Map<Integer,Integer> hash= new HashMap<>();
    for(int i=0;i<nums.length;i++){
        hash.put(nums[i],hash.getOrDefault(nums[i],0)+1);
    }    
    int []output= new int[k];
    List<Integer> []buck=new ArrayList [nums.length+1];
    for(int i=0;i<=nums.length;i++){
        buck[i]=new ArrayList<>();
    }
    for(Map.Entry<Integer,Integer> m: hash.entrySet()){
        buck[m.getValue()].add(m.getKey());
    }
    int n=buck.length;
    int y=0;
    for(int i=n-1;i>=0;i--){
        for(int j=0;j<buck[i].size();j++){
        if(y<k){
        if(buck[i].size()!=0){
            output[y]=buck[i].get(j);
            y++;
        }
        }
    }
    }
    return output;
    }
}
