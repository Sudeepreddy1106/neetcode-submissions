class Solution {
    public int countCharacters(String[] words, String chars) {
        int freq[] = new int[26];
        for (int i = 0; i < chars.length(); i++) {
            freq[chars.charAt(i) - 'a']++;
        }
        int sum=0;
        for (int i = 0; i < words.length; i++) {
            boolean valid = true;
            int j = 0;
            for (; j < words[i].length(); j++) {
                if (freq[words[i].charAt(j) - 'a'] <= 0) {
                    valid = false;
                    break;
                }
                freq[words[i].charAt(j) - 'a']--;
            }
            if (valid) {
                sum = sum + words[i].length();
            }
            for (int k = 0; k < j; k++) {
                freq[words[i].charAt(k) - 'a']++;
            }
        }
        return sum;
    }
}