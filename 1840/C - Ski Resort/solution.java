import java.util.*;
public class C1840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int q = sc.nextInt();
            int len =0;
            long ans =0; 
            for(int i =0;i<n;i++){
                int temp=sc.nextInt();
                if(temp<=q){
                    len++;
                }
                else{
                    len=0;
                }
                if(len>=k){
                    ans+=len-k+1;
                }
            }
            System.out.println(ans);
        }
    }
    
}