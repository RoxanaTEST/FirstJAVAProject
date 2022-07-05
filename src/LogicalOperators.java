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
     /*LABORATOR 4
     1. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru.
    Metoda sa verifice numarul primit, si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit
    ca si parametru. Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza*/

    public void Printtohundred(int x) {
        for (int i = x; i <= 100; i++) {

            System.out.println(i);
        }


    }

//  2. Creati o metoda in clasa LogicalOp, care sa primeasca un numar ca si parametru. Metoda sa verifice numrul primit,
//  si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru. Atentie la crearea
//  tipului metodei, deoarece metoda afiseaza, nu returneaza.

    public int Printtohundred2(float x1) {

        for (float i1 = x1; i1 <= -100; i1++) {

            System.out.println(i1);
        }
        return 0;

    }


    // 3. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar.
    //Metoda sa afiseze o numaratoare intre cele doua numere primite, pornind de la primul parametru primit,
    //pana la cel de-al doilea(ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea
    //sa se faca de la x, la y.


    public void countBetweentwonumbers(int number1, int number2) {
        for (int i = number1; i <= number2; i++) {

            System.out.println(i);

        }

        for (int i = number1; i >= number2; i--) {

            System.out.println(i);

        }

    }


    /*4. Creati o metoda in clasa LogicalOp, care sa primeasca doi parametrii de tip numar. Metoda trebuie sa verifice
    care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
    (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,  atunci numaratoarea
    sa fie de la y la x).
     Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza*/


    public void Printfromnr1tonr2(int nr1, int nr2) {
        if (nr1 < nr2) {

            for (int i = nr1; i <= nr2; i++) {

                System.out.println(i);
            }

        } else if (nr2 < nr1) {

            for (int i = nr2; i <= nr1; i++) {

                System.out.println(i);
            }
        }

    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.
    public void displayEvenNo() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.
    public void displayUnevenNo (){
        for(int i = 0;i <= 100;i++ ){
            if(i % 2 != 0){
                System.out.println(i);
            }
        }
    }

     /*7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate
     numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
      Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */

    public int getSum(int x){
        int sum = 0;
        for (int i=x ; i <= 100; i++){

            sum = (sum + i);

        }
        return sum;
    }


    /*8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
     Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media
      numerelor. La final, metoda sa returneze media. */

    public int getAverage (int x){
        int sum = 0;
        int counter = 0;

        for(int i = x; i <= 100; i++){
            sum += i;
            counter++;
        }
        return sum/counter;
    }

    /*9. Creati o metoda in clasa LogicalOp care sa afiseze urmatorul tipar:

*******

******

*****

****

***

**

*



     */
    public void printStars() {
        String star = "*";
        for (int j = 0; j < 7; j++) {
            for (int i = 7 - j; i >= 1; i--) {
                System.out.print(star);
            }
            System.out.println();
        }
    }


    }




















    /*5.r Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
    si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul primit,
     iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru a verifica
     daca functioneaza.*/

    /*public boolean isValueinarray(String[]array,String value){
        int i;
        for ( i= 0; i < array.length; i++);{
            if(array[i].equals(value)){
                return true;
            }
        }
    }*/
















