import java.util.Scanner;

public class Var1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double f;

        if (x > 2 && x < 5)
            f = 5 * Math.pow(x, 2) - 6;
        else
            f = 7 * Math.pow(x, 3) + 5;

        System.out.println("f(x)=" + f);
    }
}
2.if (x >= 0)
f = Math.sqrt(Math.pow(x,3) + 5);
        else if (x > -3 && x < 0)
f = 3 * Math.pow(x,4) + 9;

3.
        if (x <= 5)
f = Math.pow(x,2) - 6 * x + 3;
        else
f = Math.pow(x,5) + 3.5;


4.
        if (x < 1.22)
f = Math.cos(x);
else
f = 5 * Math.pow(x,3) + 1.7;

5.
        if (x > 0 && x < 2)
f = x * Math.cos(x);
else if (x >= 2)
f = 3 * Math.pow(x,4) + 7;
        else
f = 5 * Math.pow(x,2) + 1.6;

6.
        if (x < 1.5)
f = Math.tan(x) + x * Math.pow(Math.sin(x),3);
        else if (x >= 1.5 && x < 2.5)
f = x * Math.sin(x);
else
f = 3 * Math.pow(x,3) + 5;


7.
        if (x >= 1)
f = 5 * Math.pow(Math.sin(x),2) - 9;
        else
f = 3 * x + 4 * Math.cos(x);

8.
        if (x > 0 && x < 2)
f = 5 * Math.cos(x) + Math.pow(x,3);
else
f = Math.pow(x,2);

9.
        if (x > 2)
f = 1.7 * Math.pow(x,3) + 7;
        else if (x > 1)
f = 6 * x + Math.sin(x);
else
f = Math.cos(x) * Math.sin(x);


10.
        if (x > 0)
f = Math.sin(x) + 1.2 * Math.pow(x,2);
else if (x > 2 && x <= 6)
f = Math.tan(x) + Math.cos(x) + 3.5;


11.
        if (x > 4)
f = Math.log(x) + 3 * Math.pow(x,2) + 7;
        else
f = Math.sin(x) + 6 * x + Math.PI;

12.
        if (x >= 0 && x < 2)
f = 1.7 * x + Math.sin(x);
else if (x >= 2 && x <= 6)
f = Math.cos(x) + Math.tan(x);


13.
        if (x >= 1 && x < 3)
f = 5 * Math.sin(Math.pow(x,2)) + (1 - x * Math.log(x));
        else if (x >= 3 && x <= 5)
f = Math.exp(x) * Math.exp(x);

14.
        if (x >= 1 && x < 4)
f = x + Math.pow(x,2);
else
f = 3 * Math.tan(x) + 5 * Math.log(x);


15.
        if (x >= 1 && x < 3)
f = x * Math.sin(x) + Math.log(x);
else if (x >= 3 && x <= 7)
f = 1.5 * Math.exp(x) - x * Math.log(x);