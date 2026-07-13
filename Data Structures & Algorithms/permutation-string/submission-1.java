class Solution {
    public boolean checkInclusion(String s1, String s2) {
    if(s1.length()>s2.length()) return false;
    int left=0;
    int right=s1.length()-1;
    int []f= new int[26];
    int [] window= new int [26];
    for(int i=0;i<s1.length();i++){
        f[s1.charAt(i)-'a']++;
    }
    for(int i=0;i<=right;i++){
        window[s2.charAt(i)-'a']++;
    }
    while(right<s2.length()){
        boolean ret=true;
        for(int i=0;i<26;i++){
           if(f[i]!=window[i]){
            ret=false;
            break;
           }
        }
        window[s2.charAt(left)-'a']--;
        left++;
        right++;
        if(right<s2.length())
        window[s2.charAt(right)-'a']++;
        if(ret){
            return true;
        }
    }    
    return false;
    }
}
