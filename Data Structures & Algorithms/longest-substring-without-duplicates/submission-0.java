class Solution {
    public int lengthOfLongestSubstring(String s) {
    int left=0;
    int size=0;
    int max=0;
    Set<Character> set= new HashSet<>();
    for(int i=0;i<s.length();i++){
        if(!set.contains(s.charAt(i))){
         set.add(s.charAt(i));
         size++;
         if(max<size){
            max=size;
         }
        }
        else{
            set.remove(s.charAt(left));
            size--;
            if(max<size){
                max=size;
                
            }
            i--;
            left++;
            
        }
    }    
    return max;
    }
}