class Solution {
    public String mergeAlternately(String word1, String word2) {
    String output="";
    int w1=word1.length();
    int w2=word2.length();
    int k=0;
    for(int i=0;i<Math.min(w1,w2);i++){
        output=output+word1.charAt(i);
        output=output+word2.charAt(i);
        k++;
    }    
    if(w1>w2){
        for(int i=k;i<word1.length();i++){
            output=output+word1.charAt(i);
        }
    }
    else{
        for(int i=k;i<word2.length();i++){
            output=output+word2.charAt(i);
        }
    }
    return output;

    }
}