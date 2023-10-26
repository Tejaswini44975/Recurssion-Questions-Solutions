import java.util.Scanner;

public class Subsets {
    public static void solve(String ip, String op) {
        if (ip.length() == 0) {
            System.out.println(op);
            return;
        }

        String op1 = op;
        String op2 = op + ip.charAt(0);
        ip = ip.substring(1);

        solve(ip, op1);
        solve(ip, op2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the input string: ");
        String ip = scanner.next();

        String op = " ";
        solve(ip, op);
    }
}
