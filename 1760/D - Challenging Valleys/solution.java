import java.util.*;
public class D1760 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0) {
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int count = 0;
            int i = 0;
            while(i < n) {
                int j = i;
                while(j + 1 < n && arr[j] == arr[j+1]) {
                   j++;
                }
                boolean left = (i == 0 || arr[i] < arr[i-1]);
                boolean right = (j == n-1 || arr[j] < arr[j+1]);
                if(left && right) {
                    count++;
                }
 
                i = j + 1;
            }
            if(count == 1) {
                System.out.println("YES");
            }
            else {
                System.out.println("NO");
            }
        }
    }
}