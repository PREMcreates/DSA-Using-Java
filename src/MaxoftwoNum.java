import java.util.Scanner;
public class MaxoftwoNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a > b)
            System.out.println(a);
        else
            System.out.println(b);

        System.out.println(Math.max(a,b));
    }
}
