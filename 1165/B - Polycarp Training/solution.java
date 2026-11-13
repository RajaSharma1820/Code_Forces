import java.util.*;
public class B1145 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int day = 1;
        for (int i = 0; i < n; i++) {
            if (a[i] >= day) {
                day++;
            }
        }
        System.out.println(day - 1);
    }
}