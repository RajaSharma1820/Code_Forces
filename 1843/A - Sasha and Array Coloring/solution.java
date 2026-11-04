import java.util.*;
public class A1843 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            int sum =0;
            for(int i=0;i<n/2;i++){
                sum+=arr[n-i-1]-arr[i];
            }
            System.out.println(sum);
        }
    }
    
}