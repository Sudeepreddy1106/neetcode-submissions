class Solution {
    public boolean validWordAbbreviation(String word, String abbr) {
        int w = 0;
        int a = 0;
        while (w < word.length() && a < abbr.length()) {
            if (Character.isLetter(abbr.charAt(a))) {
                if (word.charAt(w) != abbr.charAt(a)) {
                    return false;
                }
                a++;
                w++;
            } else {
                 if (abbr.charAt(a) == '0') {
                    return false;
                }
                int num = 0;
                while (a < abbr.length() && Character.isDigit(abbr.charAt(a))) {
                    num = num * 10 + (abbr.charAt(a) - '0');
                    a++;
                }

                w += num;
            }
        }
        return w == word.length() && a == abbr.length();
    }
}