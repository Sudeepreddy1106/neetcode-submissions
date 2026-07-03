class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;

        String st = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        int right = st.length() - 1;

        while (left < right) {
            if (st.charAt(left) != st.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
