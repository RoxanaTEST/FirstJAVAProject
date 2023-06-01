public class Calculator {
    //exercitiul 1
    public static int sum(int a, int b) {
        return a + b;
    }

    public static double division(double c, double d) {
        return c / d;
    }

    public static double exercise1(double e, double f, double g) {
        return e + f * g;
    }

    public static double exercise2(double h, double i) {
        return (h + i) % i;
    }

    public static int exercise3(int j, int k, int l, int m) {
        return j + k * l / m;
    }

    public static int exercise4(int n, int o, int p, int q, int r) {
        return n + o / p * q - r % p;

    }
    //exercitiul 2

    public static int sum2(int a, int b) {
        int result = a + b;
        return result;
    }

    public static int subtraction(int a, int b) {
        int result = a - b;
        return result;
    }

    public static int multiply(int a, int b) {
        int result = a * b;
        return result;

    }

    public static double division2(double a, double b) {
        double result = a / b;
        return result;
    }

    public static int divisionremainder(int a, int b) {
        int result = a % b;
        return result;

    }

    /*1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului
     polimorfismului. Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
     */
    public static int sum(int a, int b, int c) {
        return a + b + c;

    }

    public static double sum(int a, int b, double c) {
        return a + b + c;
    }

    public static double division(double c, double d, double c1) {
        return c / d / c1;
    }

    public static int sum2(int a, int b, int c2) {
        int result = a + b + c2;
        return result;
    }

    public static int subtraction(int a, int b, int c) {
        int result = a - b - c;
        return result;
    }
    public static int multiply(int a, int b, int c) {
        int result = a * b * c;
        return result;

    }


}
