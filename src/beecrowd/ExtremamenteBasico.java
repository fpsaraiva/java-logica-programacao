package beecrowd;

import java.util.Scanner;

public class ExtremamenteBasico {
    public static void main(String[] args) {
        Scanner t = new Scanner(System.in);

        int A = t.nextInt();
        int B = t.nextInt();

        int X = A + B;

        System.out.print("X = " + X);

        t.close();
    }
}
