import java.util.*;
public class Sereja {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int left =0;
        int right = n-1;
        int serejascore = 0;
        int dimascore =0;
        while(left<=right){
            if(arr[left]>=arr[right]){
                serejascore+=arr[left];
                left++;
            }
            else{
                serejascore+=arr[right];
                right--;
            }
            if(left<=right){
            if(arr[left]>=arr[right]){
                dimascore+=arr[left];
                left++;
            }
            else{
                dimascore+=arr[right];
                right--;
            }
            }
        }
        System.out.println(serejascore+" "+dimascore);
    }
}