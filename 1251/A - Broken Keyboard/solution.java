import java.util.*;
public class A1251{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            boolean[] good = new boolean[26];
            int i = 0;
            while (i < s.length()) {
                char ch = s.charAt(i);
                int count = 0;
                while (i < s.length() && s.charAt(i) == ch) {
                    count++;
                    i++;
                }
                if (count % 2 == 1) {
                    good[ch - 'a'] = true;
                }
            }
            for (int j = 0; j < 26; j++) {
                if (good[j]) {
                    System.out.print((char)('a' + j));
                }
            }
            System.out.println();
        }
    }
}