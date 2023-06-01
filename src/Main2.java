public class Main2 {
    public static void main(String[] args) {
         /*1. In proiectul de Calculator, in clasa Calculator, supraincarcati toate metodele conform principiului
         polimorfismului. Creati cel putin cate doua metode polimorfe pentru fiecare metoda pe care o aveti in clasa.
         */
        System.out.println(Calculator.sum(7, 8,10));
        System.out.println(Calculator.sum(7, 99 ,100));
        System.out.println(Calculator.division(50,10,1));
        System.out.println(Calculator.sum2(90,700,10));
        System.out.println(Calculator.subtraction(900,50,850));
        System.out.println(Calculator.multiply(5,10,50));

        //exercitiul 1
        System.out.println(String1.Printmyname());
        System.out.println(String1.poezie());
        System.out.println(Calculator.sum(7, 8));
        System.out.println(Calculator.division(20, 7));
        System.out.println(Calculator.exercise1(-5, 8, 6));
        System.out.println(Calculator.exercise2(55, 9));
        System.out.println(Calculator.exercise3(20, -3, 5, 8));
            System.out.println( Calculator.exercise4(5, 15, 3, 2, 8));
        //exercitiul 2
        System.out.println("\n");
        System.out.println(Calculator.sum2(99, 1));
        System.out.println(Calculator.subtraction(2650, 49));
        System.out.println(Calculator.multiply(33, 10));
        System.out.println(Calculator.division2(100, 3));

        System.out.println("\n");
        //exercitiul 3

        Drawing drawing = new Drawing();
        drawing.printmodel1();
        System.out.println("\n");


        //exercitiul 4
        System.out.println("Write 3 numbers to find out the mean");
        arithmetic mean = new arithmetic();
        mean.calculatearithmetic();


        System.out.println("\n");
        //exercitiul 5
        Drawing drawing1 = new Drawing();
        drawing1.printmodel2();


        //exercitiul 6
        System.out.println("\n");
        System.out.println(Calculator.divisionremainder(17,2));

        //exercitiul 7

        temperature temp = new temperature();
        temp.calculatetemperature();

        //exercitiul 8
        Distance dist = new Distance();
        dist.calculatedistance();


    }






}

