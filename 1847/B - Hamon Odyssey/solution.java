import java.util.*;
 
public class B1847 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
 
        int t = sc.nextInt();
 
        while (t-- > 0) {
            int n = sc.nextInt();
 
            int ans = 0;
            int sum = -1;
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
 
                sum = sum & x;
 
                if (sum == 0) {
                    ans++;
                    sum = -1;
                }
            }
 
            System.out.println(Math.max(1, ans));
        }
    }
}