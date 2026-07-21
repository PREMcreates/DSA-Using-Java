import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two numbers :");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Enter operation:");
        String ch = in.next();
        switch (ch){
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case "/":
                if (b != 0){
                    System.out.println(a / b);
                }
                break;
            case "%":
                System.out.println(a % b);
                break;
            default:
                System.out.println("Enter valid operation");
        }
    }
}
