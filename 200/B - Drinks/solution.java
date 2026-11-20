import java.util.*;
public class B200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum = 0;
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            sum += p;
        }
        double ans = sum / n;
        System.out.println(ans);
    }
}