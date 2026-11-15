import java.util.*;
public class A71 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while(n-->0){
            String a = sc.next();
            if(a.length()<=10){
                System.out.println(a);
            }
            else{
                int middle = a.length()-2;
                System.out.println(a.charAt(0)+""+middle+a.charAt(a.length()-1));
            }
        }
    }
    
}