public class DeCompress {

    public static void main(String[] args) {
        String s = "a5u9t7";
        System.out.println(deCompressString(s));
    }

    public static String repeaString(int num, char ch) {
        String ans = "";
        for (int i = 0; i < num; i++) {
            ans += ch;
        }
        return ans;
    }

    public static String deCompressString(String s) {
        String ans = "";
        char temp = '\u0000';
        int num = 0;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if ((ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z')) {
                // If we had a previous char+num pending, flush it
                if (num > 0) {
                    ans += repeaString(num, temp);
                    num = 0;
                }
                temp = ch;
            } 
            else if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0'); // handles multi-digit numbers
            }
        }

        // flush last pending repeat
        ans += repeaString(num, temp);

        return ans;
    }
}
