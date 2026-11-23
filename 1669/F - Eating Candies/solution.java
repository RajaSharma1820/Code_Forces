import java.util.*;
public class F1669 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int left = 0;
            int right = arr.length-1;
            int alice = 0;
            int bob =  0;
            int max = 0;
            int count =0;
            while(left<=right){
                if(alice<=bob){
                alice+=arr[left];
                left++;
                }
                else{
                bob+=arr[right];
                right--;
                }
                if(alice == bob){
                    max = Math.max(max,left+(n-1-right));
                }
            }
            System.out.println(max);
        }
    }
}