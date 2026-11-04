import java.util.*;
public class A1689{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int k = sc.nextInt();
            String a = sc.next();
            String b = sc.next();
            char[] arr1 = a.toCharArray();
            char[] arr2 = b.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);
            int i = 0;
            int j = 0;
            int countA = 0;
            int countB = 0;
            StringBuilder ans = new StringBuilder();
            while (i < n && j < m) {
                if (countA == k) {
                    ans.append(arr2[j]);
                    j++;
                    countB++;
                    countA = 0;
                }
                else if (countB == k) {
                    ans.append(arr1[i]);
                    i++;
                    countA++;
                    countB = 0;
                }
                else if (arr1[i] < arr2[j]) {
                    ans.append(arr1[i]);
                    i++;
                    countA++;
                    countB = 0;
                }
                else {
                    ans.append(arr2[j]);
                    j++;
                    countB++;
                    countA = 0;
                }
            }
            System.out.println(ans);
        }
    }
}