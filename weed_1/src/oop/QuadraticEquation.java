package oop;
import java.util.Scanner;

public class QuadraticEquation {
    private double a, b, c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }

    public boolean hasTwoRoots() {
        return getDiscriminant() > 0;
    }

    public boolean hasOneRoot() {
        return getDiscriminant() == 0;
    }

    public void solve() {
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm hoặc vô số nghiệm.");
            } else {
                double x = -c / b;
                System.out.println("Phương trình bậc nhất. Nghiệm x = " + x);
            }
            return;
        }

        double delta = getDiscriminant();

        if (delta > 0) {
            double x1 = (-b + Math.sqrt(delta)) / (2 * a);
            double x2 = (-b - Math.sqrt(delta)) / (2 * a);
            System.out.println("Phương trình có 2 nghiệm phân biệt:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (delta == 0) {
            double x = -b / (2 * a);
            System.out.println("Phương trình có nghiệm kép: x = " + x);
        } else {
            System.out.println("Phương trình vô nghiệm (nghiệm phức).");
        }
    }
}

 class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.print("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.print("Nhập c: ");
        double c = scanner.nextDouble();

        QuadraticEquation qe = new QuadraticEquation(a, b, c);
        qe.solve();
    }
}
