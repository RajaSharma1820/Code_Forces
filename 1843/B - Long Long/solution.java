import java.util.*;
public class B1843{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            long sum = 0;
            int count = 0;
            int prev = 0;
            for (int i = 0; i < n; i++) {
                sum += Math.abs((long) arr[i]);
                if (arr[i] != 0) {
                    if (arr[i] < 0 && prev >= 0) {
                        count++;
                    }
                    prev = arr[i];
                }
            }
            System.out.println(sum + " " + count);
        }
 }
}