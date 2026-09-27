class Solution {
    int n;
    List<String> result = new ArrayList<>();

    // Check whether one part of IP address is valid
    boolean isValid(String str) {

        // Leading zero is not allowed
        if (str.length() > 1 && str.charAt(0) == '0') {
            return false;
        }

        int val = Integer.parseInt(str);

        return val >= 0 && val <= 255;
    }
     void solve(String s, int idx, int parts, String curr) {

        // We have used all characters and created 4 parts
        if (idx == n && parts == 4) {
            result.add(curr.substring(0, curr.length() - 1));
            return;
        }

        // We already have 4 parts
        if (parts == 4) {
            return;
        }
        // Take 1 character
        if (idx + 1 <= n) {
            solve(
                s,
                idx + 1,
                parts + 1,
                curr + s.substring(idx, idx + 1) + "."
            );
        }

        // Take 2 characters
        if (idx + 2 <= n && isValid(s.substring(idx, idx + 2))) {
            solve(
                s,
                idx + 2,
                parts + 1,
                curr + s.substring(idx, idx + 2) + "."
            );
        }
        // Take 3 characters
        if (idx + 3 <= n && isValid(s.substring(idx, idx + 3))) {
            solve(
                s,
                idx + 3,
                parts + 1,
                curr + s.substring(idx, idx + 3) + "."
            );
        }
    }
    public List<String> restoreIpAddresses(String s) {
           n = s.length();
        result.clear();

        // An IP address has 4 parts and each part
        // has maximum 3 digits
        if (n < 4 || n > 12) {
            return result;
        }

        solve(s, 0, 0, "");

        return result;
    }
}