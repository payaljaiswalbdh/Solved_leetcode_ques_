class Solution {
    public String decodeString(String s) {

        Stack<Integer> num = new Stack<>();
        Stack<String> str = new Stack<>();

        int curr_no = 0;
        String curr_str = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

    
            if (Character.isDigit(ch)) {
                curr_no = curr_no * 10 + (ch - '0');
            }

            else if (ch == '[') {
                num.push(curr_no);
                str.push(curr_str);

                curr_no = 0;
                curr_str = "";
            }


            else if (ch == ']') {

                int no_of_reap = num.pop();
                String prev_str = str.pop();

                String temp = "";

                for (int j = 0; j < no_of_reap; j++) {
                    temp += curr_str;
                }

                curr_str = prev_str + temp;
            }

            else {
                curr_str += ch;
            }
        }

        return curr_str;
    }
}