import java.util.*;
public class A131 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for(int i = 1; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))) {
                count++;
            }
        }
        if(count == s.length() - 1) {
            if(Character.isUpperCase(s.charAt(0))) {
                System.out.println(s.toLowerCase());
            } else {
                System.out.println(Character.toUpperCase(s.charAt(0)) + s.substring(1).toLowerCase());
            }
        } else {
            System.out.println(s);
        }
    }
}