import java.util.*;
public class Lecture_Sleep {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        int[] brr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            brr[i]=sc.nextInt();
        }
        int sum =0;
        for(int i=0;i<n;i++){
            if(brr[i]==1){
                sum+=arr[i];
            }
        }
        int winsum =0;
        for(int i=0;i<k;i++){
            if(brr[i]==0){
                winsum+=arr[i];
            }
        }
        int max = winsum;
        for(int i=k;i<n;i++){
            if(brr[i]==0){
                winsum+=arr[i];
            }
            if(brr[i-k]==0){
                winsum-=arr[i-k];
            }
            max = Math.max(max,winsum);
        }
        System.out.println(sum+max);
    }
    
}