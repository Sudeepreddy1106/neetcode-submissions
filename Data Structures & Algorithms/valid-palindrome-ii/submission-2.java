class Solution {
    public boolean validPalindrome(String s) {
        int left = 0;

        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = st.length() - 1;
        int i = 0;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return ispal(st, left + 1, right) || ispal(st, left, right - 1);
            }
            left++;
            right--;
        }
        return true;
    }
    

boolean ispal(String s, int l, int r) {
    while (l < r) {
        if (s.charAt(l) != s.charAt(r)) {
            return false;
        }
        l++;
        r--;
    }
    return true;
}
}