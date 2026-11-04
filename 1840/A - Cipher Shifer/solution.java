import java.util.*;
public class A1840 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            String s = sc.next();
            int i=0;
            String ans = "";
            while(i<n){
                ans+=s.charAt(i);
                int j = i+1;
                while(s.charAt(i)!=s.charAt(j)){
                        j=j+1;
                }
                i=j+1;
            }
            System.out.println(ans);
        }
    }
}