import java.util.*;
public class B1622 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] p = new int[n];
            for (int i = 0; i < n; i++) p[i] = sc.nextInt();
            String s = sc.next();
            Integer[] idx = new Integer[n];
            for (int i = 0; i < n; i++) idx[i] = i;
            Arrays.sort(idx, (a, b) -> Integer.compare(p[a], p[b]));
            int zero = 0;
            for (int i = 0; i < n; i++) {
                if (s.charAt(i) == '0') zero++;
            }
            int[] q = new int[n];
            int low = 1, high = zero + 1;
            for (int i : idx) {
                if (s.charAt(i) == '0') {
                    q[i] = low++;
                } else {
                    q[i] = high++;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(q[i] + " ");
            }
            System.out.println();
        }
    }
}