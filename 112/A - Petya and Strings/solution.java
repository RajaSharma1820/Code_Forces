import java.util.*;
public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        String s1 = a.toLowerCase();
        String s2 = b.toLowerCase();
        int result = 0;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) < s2.charAt(i)) {
                result = -1;
                break;
            }
            else if (s1.charAt(i) > s2.charAt(i)) {
                result = 1;
                break;
            }
        }
        System.out.println(result);
    }
}