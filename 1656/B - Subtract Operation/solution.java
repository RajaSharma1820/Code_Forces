import java.util.*;
public class B1656 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int left = 0;
            int right = 1;
            int ans = 0;
            while(right<n){
                int diff = arr[right] - arr[left];
                if(diff == k){
                    ans = 1;
                    break;
                }
                else if(diff < k){
                    right++;
                }
                else{
                    left++;
                    if(left == right){
                        right++;
                    }
                }
            }
            if(ans == 1){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}