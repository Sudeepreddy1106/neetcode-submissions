class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        boolean valid = true;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ('[') || s.charAt(i) == ('{') || s.charAt(i) == ('(')) {
                st.push(s.charAt(i));
            } else {
                if (!st.isEmpty()&&st.peek() == '[' && s.charAt(i) == ']'  ) {
                    st.pop();
                } else if (!st.isEmpty()&&st.peek() == '{' && s.charAt(i) == '}') {
                    st.pop();
                } else if (!st.isEmpty()&&st.peek() == '(' && s.charAt(i) == ')') {
                    st.pop();
                } else {
                    return false;
                }
            }
        }
        valid = st.isEmpty();
        return valid;
    }
}
