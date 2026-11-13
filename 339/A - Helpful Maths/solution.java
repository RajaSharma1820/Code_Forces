import java.util.*;
public class A339 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int[] count = new int[4];
        for (char c : s.toCharArray()) {
            if (c >= '1' && c <= '3') {
                count[c - '0']++;
            }
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 3; i++) {
            while (count[i]-- > 0) {
                if (sb.length() > 0) sb.append("+");
                sb.append(i);
            }
        }
        System.out.println(sb);
    }
}