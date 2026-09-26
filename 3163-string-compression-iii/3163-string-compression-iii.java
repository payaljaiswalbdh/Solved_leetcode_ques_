class Solution {
    public String compressedString(String word) {
        int n = word.length();
        String comp = "";
        int i = 0;

        while (i < n) {
            int count = 0;
            char ch = word.charAt(i);

            while (i < n && word.charAt(i) == ch && count < 9) {
                count++;
                i++;
            }

            comp += count;
            comp += ch;
        }

        return comp;
    }
}