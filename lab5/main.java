1.
import java.util.Scanner;

public class Function1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();
        double f;

        if (x < 0) {
            f = 5 * Math.pow(Math.sin(x), 2) - 9;
        } else if (x >= 0 && x < 1) {
            f = 3 * x + 4 * Math.cos(x);
        } else {
            f = Math.pow(x, 2) + 1;
        }

        System.out.println("f(x) = " + f);
    }
}



2.import java.util.Scanner;

public class Function2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("x мәнін енгізіңіз: ");
        double x = scanner.nextDouble();
        double f;

        if (x < 1.5) {
            f = Math.tan(x) + x * Math.pow(Math.sin(x), 3);
        } else if (x >= 1.5 && x < 2.5) {
            f = x * Math.sin(x);
        } else {
            f = 3 * x + 5;
        }

        System.out.println("f(x) = " + f);
    }
}