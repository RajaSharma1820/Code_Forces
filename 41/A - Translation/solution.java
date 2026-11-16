import java.util.*;
public class A41 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        if(s.length()!=t.length()){
            System.out.println("NO");
            return;
        }
        int a = t.length()-1;
        for(int i=0;i<t.length();i++){
            if(s.charAt(i)==t.charAt(a)){
                a--;
            }
            else{
                System.out.println("NO");
                return;
            }
 
        }
        System.out.println("YES");
    }
}