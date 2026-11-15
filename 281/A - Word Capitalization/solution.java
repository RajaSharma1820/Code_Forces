import java.util.*;
public class A281 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String ans = "";
        if(s.charAt(0)>='A' && s.charAt(0)<='Z'){
            System.out.println(s);
        }
        else{
            ans+=Character.toUpperCase(s.charAt(0));
            ans+=s.substring(1);
            System.out.println(ans);
        }
    }
}