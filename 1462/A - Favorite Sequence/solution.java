import java.util.Scanner;
public class A1462 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int[] brr = new int[n];
            int left = 0;
            int right = n - 1;
            for (int i = 0; i < n; i++) {
                if (i % 2 == 0) {
                    brr[i] = arr[left];
                    left++;
                } 
                else {
                    brr[i] = arr[right];
                    right--;
                }
            }
            for (int i = 0; i < n; i++) {
                System.out.print(brr[i] + " ");
            }
            System.out.println();
        }
    }
}