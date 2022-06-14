import java.util.Scanner;
public class Main3 {

    public static void main(String[] args) {
        // 1 toate metodele pentru tema lab 10 pot fi apelate in main 2
        // 2 am creeat o clasa de tip Logical operators
        /* 3.In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si
         parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca
         si parametrii, si returnati numarul mai mare.
         */
        LogicalOperators op = new LogicalOperators();
        int biggest = op.checkBiggerNumber(2,4);
        System.out.println("The bigger number is: " + biggest);
        System.out.println("\n");

        // 4.Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”
        String textinput = "FastTrack";
        System.out.println(op.Verifytext(textinput));
        System.out.println("\n");

        /* 5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic
    // sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este
    // mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica
    // daca functioneaza.*/

        String textInput = "FastTrackIT";
        int number = 2;
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Introduceti text:");
        textInput = scanner1.next();
        System.out.println("Introduceti numar:");
        number = scanner1.nextInt();

        System.out.println(op.verifyTextAndNumber(textInput,number));


        System.out.println("\n");

        /*.6. Creati o metoda de tip String, care sa primeasca un parametru de tip int. Daca numarul primit este mai mare
         de 8, SAU egal cu 6, atunci sa se returneze “The amount of snow this winter was(cm): “ si numarul. Daca nu,
        sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca functioneaza*/

         int number1 = 6;
        System.out.println(op.Verifynumber1(number1));
        System.out.println("\n");

        /* 7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
        Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati
        “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.
         */

        int number2 = 10;
        System.out.println(op.Verifynumber2(number2));
        System.out.println("\n");

       /* 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
        Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
        unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
        "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz
        din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
        */

        int number3 =1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduceti un numar : ");
        number3 = scanner.nextInt();
        System.out.println(op.shownumber(number3));
        System.out.println(number3);

        System.out.println("\n");

        /* 9.    Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
          si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returneze false.
          Apelati metoda in main() pentru a verifica daca functioneaza.*/

        int number4 = 21;
        System.out.println(op.isNumberEven(number4));
        System.out.println("\n");


        /*10.Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
         care sa reprezinte varsta, iar metoda sa iti zica daca persoana are drept de vot. Daca varsta e peste 18,
         sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
         */

        int age =17;
        System.out.println("Type in your age to find out if your eligible to vote: ");
        age = scanner.nextInt();
        System.out.println(op.isEligibletoVote(age));
        System.out.println("\n");


        /*11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
         Apelati metoda in main() pentru a verifica daca functioneaza*/

        int no1=30;
        int no2=100;
        int no3=10;
        System.out.println(op.biggerNumber1(no1,no2,no3));
        System.out.println("\n");




    }
}//

//// 3. Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number Facut in clasa
//
//        int numberinput =6;
//        System.out.println(op.Verifynumber(numberinput));
//        System.out.println("\n");