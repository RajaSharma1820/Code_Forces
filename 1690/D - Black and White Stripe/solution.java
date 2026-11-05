import java.util.*;
public class B1690 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            String s = sc.next();
            int count =0;
            int min = Integer.MAX_VALUE;
            for(int i=0;i<k;i++){
                if(s.charAt(i)=='W'){
                    count++;
                }
            }
            min = Integer.min(min,count);
            for(int i=1;i<=n-k;i++){
                if(s.charAt(i-1)=='W'){
                    count--;
                }
                if(s.charAt(i+k-1)=='W'){
                    count++;
                }
                min = Integer.min(count,min);
            }
            System.out.println(min);
        }
    }
}