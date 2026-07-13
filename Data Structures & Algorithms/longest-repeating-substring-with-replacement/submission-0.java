class Solution {
    public int characterReplacement(String s, int k) {
    int window=0;
    int maxwindow=0;
    int maxfreq=0;
    int []freq= new int [26];
    int left=0;
    int right=0;
    while(right<s.length()){
        freq[s.charAt(right)-'A']++;
        window++;
        maxfreq=Math.max(freq[s.charAt(right)-'A'],maxfreq);
        if(window-maxfreq>k){
           freq[s.charAt(left)-'A']--; 
           left++;
           window--;
        }
        maxwindow=Math.max(window, maxwindow);
        right++;
    }  
    return maxwindow;  
    }
}
