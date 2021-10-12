package BT2;

import java.util.Scanner;

public class QuadraticEquation {
   private double a;
   private double b;
   private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public void setA(double a) {
        this.a = a;
    }

    public void setB(double b) {
        this.b = b;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {

        return ((-this.b + Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public double getRoot2() {

        return ((-this.b - Math.sqrt(getDiscriminant())) / (2 * this.a));
    }

    public double getRoot3() {
        return -this.b / (2 * this.a);
    }

    public String displayRoot() {
        return "Phương trình có 2 nghiệm phân biệt là : \nr1 = " + getRoot1() + " \nr2 = " + getRoot2();
    }

}

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        QuadraticEquation quadraticEquation = new QuadraticEquation(a, b, c);
        if (a > 0) {
            if (quadraticEquation.getDiscriminant() < 0) {
                System.out.println("phương trình vô nghiệm");
            } else if (quadraticEquation.getDiscriminant() > 0) {
                System.out.println(quadraticEquation.displayRoot());
            } else if (quadraticEquation.getDiscriminant() == 0) {
                System.out.println("phương trình có nghiệm kép là " + quadraticEquation.getRoot3());

            }
        } else
            System.out.println("phương trình vô nghiệm alo");

    }
}





