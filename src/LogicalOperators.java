

 import javax.swing.*;
 import java.util.Scanner;

public class LogicalOperators {
    /* 3.In clasa LogicalOp, creati o metoda de tip int, care sa se numeasca checkBiggerNumber(), si sa primeasca doua int-uri ca si
       parametrii. Folosind if - else, verificati in interiorul metode care numar este mai mare, dintre cele doua valori care va vin ca
       si parametrii, si returnati numarul mai mare. */
    public int checkBiggerNumber(int first, int second) {
        if (first > second) {
            return first;
        } else {
            return second;
        }
    }

    // 4.Given a text input, if it is “FastTrack”, then print “Learning text comparison”. If not, print “Got to try some more”
    public String Verifytext(String textinput) {
        if (textinput.equals("FastTrack")) {
            return "Learning text comparison";
        } else if (!textinput.equals("FastTrack")) {
            return "Got to try some more";
        }
        return "not applicable";
    }

    // 5.Creati o metoda de tip String, care sa primeasca un parametru de tip String, si un parametru de tip int.
    // Daca textul primit ca si parametru este egal cu “FastTrackIT”, si numarul primit ca si parametru este mai mic
    // sau egal cu 3, returnati textul si numarul, in ordinea asta. Daca textul nu este “FastTrackIT” si numarul este
    // mai mare sau egal cu 4, returnati numarul si textul, in ordinea asta. Apelati metoda in main() pentru a verifica
    // daca functioneaza.

    public String verifyTextAndNumber(String textInput, int number) {
        if (textInput.equals("FastTrack") && number <= 3) {
            return (textInput + number);
        } else if (!textInput.equals("FastTrack") && number >= 4) {
            return (number + textInput);
        }
        return "Not applicable";
    }




        // 6. Creati o metoda de tip String, care sa primeasca un parametru de tip int.
        // Daca numarul primit este mai mare de 8, SAU egal cu 6, atunci sa se returneze
        // “The amount of snow this winter was(cm):
        // “ si numarul.
        // Daca nu, sa printeze “The forecast snow is(cm):” si numarul. Apelati metoda in main() pentru a verifica daca
        // functioneaza.


    public String Verifynumber1(int number1) {
        if (number1 > 8 || number1 == 6) {
            return (" The amount of snow this winter was " + number1 + " cm ");
        } else {
            return (" The forecast snow is: " + number1 + " cm ");
        }

    }
      /* 7. Creati o metoda de tip String, care sa primeasca un parametru de tip numar.
        Daca numarul e mai mare decat 3, SI nu egal cu 4, returnati “The number is greater than 3 and not equal to 4”.
        Daca numarul este egal cu 4, returnati “The number is equal to 4”, iar daca numarul este mai mic de 3 returnati
        “The number is lower than 3”. Apelati metoda in main() pentru a verifica daca functioneaza.
         */

    public String Verifynumber2(int number2) {
        if (number2 > 3 && number2 != 4) {
            return "The number is greater than 3 and not equal to 4";
        }
        if (number2 == 4) {
            return "The number is equal to 4";
        }
        if (number2 < 3) {
            return "The number is lower than 3";
        }
        return null;
    }

    /* 8. Creati o metoda care primeste un numar ca si parametru si sa afiseze ce numar a primit.
    Folosind constructia Switch-Case, verificati ce numar s-a primit si afisati textul "The number is:  x !"
    unde x trebuie sa reprezinte numarul apasat. Pentru exemplul de fata sa nu se foloseasca concatenarea stringului
    "The number is:" cu numarul de la parametru, ci sa se scrie intreg textul cu tot cu numar pentru fiecare caz
    din Switch-Case. Apelati metoda in main() pentru a verifica daca functioneaza.
    */
    public String shownumber(int number3) {

        switch (number3) {
            case 1:
                System.out.println("THE NUMBER IS");
                System.out.println(number3);
                break;
            case 2:
                System.out.println("THE NUMBER IS ");
                System.out.println(number3);
                break;
            case 3:
                System.out.println("THE NUMBERS IS ");
                System.out.println(number3);
                break;
            case 4:
                System.out.println("THE NUMBERS IS");
                System.out.println(number3);
                break;
        }
        return "THE NUMBER IS: ";
    }
     /* 9 Creati o metoda care sa se numeasca isNumberEven. Metoda trebuie sa primeasca ca parametru un numar,
       si sa returneze adevarat sau fals. Daca numarul e par sa returneze true iar daca e impar sa returnese false.
       Apelati metoda in main() pentru a verifica daca functioneaza.
          */

    public String isNumberEven(int number4) {
        if (number4 % 2 == 0) {
            return ("True");
        } else return ("False");

    }

    /*10.Creati o metoda care sa se numeasca isEligibleToVote. Metoda sa primeasca ca si parametru un numar,
     care sa reprezinte varsta, iar metoda sa iti zica daca persoana are drept de vot. Daca varsta e peste 18,
     sa se returneze true iar daca nu, sa returneze false. Apelati metoda in main() pentru a verifica daca functioneaza.
     */
    public String isEligibletoVote(int age) {
        if (age > 18) {
            return "True,you are eligible to vote";
        }
        if (age < 18) {
            return "False,you're not eligible to vote yet:)";
        }
        return "NA";
    }

    //11. Creati o metoda care sa primeasca 3 numere ca si parametrii si sa returneze cel mai mare numar.
    // Apelati metoda in main() pentru a verifica daca functioneaza.

    public int biggerNumber1(int no1, int no2, int no3) {
        if (no1 > no2 && no1 > no3) {
            return no1;
        } else if (no2 > no3) {
            return no2;
        } else return no3;

    }
}




//
 // Facut in clasa
    /* Given a number, if it’s equal to or higher than 2 and equal to or lower than 8, print the number
       public int Verifynumber(int inputnumber) {
        if (inputnumber >= 2 && inputnumber <= 8) {
            return inputnumber;
        } else {
            return 0;

     }*/











