import java.util.*;
public class A118 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next().toLowerCase();
        for(int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == 'a' || ch == 'o' || ch == 'y' ||
               ch == 'e' || ch == 'u' || ch == 'i') {
                continue;
            }
            System.out.print("." + ch);
        }
    }
}