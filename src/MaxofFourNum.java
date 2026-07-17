import java.util.Scanner;

import java.util.Scanner;
public class MaxofFourNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();

        int num1 = Math.max(a,b);
        int num2 = Math.max(c,d);
        int ans = Math.max(num1,num2);
        System.out.println(ans);
    }
}
