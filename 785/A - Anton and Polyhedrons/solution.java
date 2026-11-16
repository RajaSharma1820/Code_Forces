import java.util.*;
public class A785 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count =0;
        while (n-->0){
            String s = sc.next();
            if(s.equals("Tetrahedron")){
                count+=4;
            }
            else if(s.equals("Octahedron")){
                count+=8;
            }
            else if(s.equals("Dodecahedron")){
                count+=12;
            }
            else if(s.equals("Icosahedron")){
                count+=20;
            }
            else if(s.equals("Cube")){
                count+=6;
            }
        }
        System.out.println(count);
    }    
}