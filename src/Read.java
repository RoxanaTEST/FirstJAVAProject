
    import java.util.InputMismatchException;
    import java.util.Scanner;

    public class Read {


        //1. In clasa Read, din programul vostru, creati o metoda tratat, care sa returneze un numar de la tastatura.
        public double getDouble() {
            double number = 0;
            boolean repeat;
            Scanner scan = new Scanner(System.in);
            do {
                try {
                    System.out.println("Please enter a number: ");
                    number = scan.nextDouble();
                    repeat = false;
                } catch (InputMismatchException exception) {
                    System.err.println("Please enter a valid number! Given value: " + scan.next());
                    repeat = true;
                }
            } while (repeat);
            return number;
        }

        //2. In clasa Read, duplicati metoda de la punctul 1, astfel incat sa aveti mai multe metode,
        // care sa citeasca si sa returneze si alte tipuri de numere (float, int, double, long, etc)

        public int getInt() {
            int number = 0;
            boolean repeat;
            Scanner scan = new Scanner(System.in);
            do {
                try {
                    System.out.println("Please enter a number: ");
                    number = scan.nextInt();
                    repeat = false;
                } catch (InputMismatchException exception) {
                    System.err.println("Please enter a valid number! Given value: " + scan.next());
                    repeat = true;
                }
            } while (repeat);
            return number;
        }


        public float getFloat() {
            float number = 0;
            boolean repeat;
            Scanner scan = new Scanner(System.in);
            do {
                try {
                    System.out.println("Please enter a number: ");
                    number = scan.nextFloat();
                    repeat = false;
                } catch (InputMismatchException exception) {
                    System.err.println("Please enter a valid number! Given value: " + scan.next());
                    repeat = true;
                }
            } while (repeat);
            return number;
        }


        public long getLong() {
            long number = 0;
            boolean repeat;
            Scanner scan = new Scanner(System.in);
            do {
                try {
                    System.out.println("Please enter a number: ");
                    number = scan.nextLong();
                    repeat = false;
                } catch (InputMismatchException exception) {
                    System.err.println("Please enter a valid number! Given value: " + scan.next());
                    repeat = true;
                }
            } while (repeat);
            return number;
        }

    }


