
import java.util.List;
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
     /*LABORATOR 4 FOR
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
    public void displayUnevenNo() {
        for (int i = 0; i <= 100; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
    }

     /*7. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar. Metoda sa adune toate
     numerele pana la 100, pornind de la numarul primit ca si parametru, iar la final sa returneze rezultatul.
      Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */

    public int getSum(int x) {
        int sum = 0;
        for (int i = x; i <= 100; i++) {

            sum = (sum + i);

        }
        return sum;
    }


    /*8. Creati o metoda in clasa LogicalOp care sa primeasca un parametru de tip numar.
     Metoda sa adune toate numerele pana la 100, pornind de la numarul primit ca si parametru, si sa calculeze media
      numerelor. La final, metoda sa returneze media. */

    public int getAverage(int x) {
        int sum = 0;
        int counter = 0;

        for (int i = x; i <= 100; i++) {
            sum += i;
            counter++;
        }
        return sum / counter;
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

/*LABORATOR 4 WHILE
  1. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice numrul primit,
  si sa afiseze in consola o numaratoare pana la 100, pornind de la numarul primit ca si parametru. Atentie la crearea tipului metodei,
  deoarece metoda afiseaza, nu returneaza.*/

    public void counttohundredWhile(int x) {
        while (x <= 100) {
            System.out.println(x);
            x++;
        }

    }
    /*2. Creati o metoda in clasa LogicalOp, care sa primeste un numar ca si parametru. Metoda sa verifice
     numrul primit, si sa afiseze in consola o numaratoare pana la -100, pornind de la numarul primit ca si parametru.
     Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.*/

    public void countBackwordsWhile(int x) {
        while (x >= -100) {
            System.out.println(x);
            x--;
        }
    }
    /*3. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda sa afiseze o numaratoare
     intre cele doua numere primite, pornind de la primul parametru primit, pana la cel de-al doilea
     (ex: daca int x e primul parametru iar int y  este cel de-al doilea, numaratoarea sa se faca de la x, la y.
     Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.*/

    public void countBetween2nr(int x, int y) {
        while (x <= y) {
            System.out.println(x);
            x++;
        }
    }
    /*4. Creati o metoda in clasa LogicalOp, care sa primeste doi parametrii de tip numar. Metoda trebuie sa verifice
     care dintre cele doua numere este mai mare, si sa execute o numaratoare crescatoare de la cel mai mic la cel mai mare.
     (ex: daca int x e primul parametru iar int y  este cel de-al doilea, daca x  este mai mare decat y,
      atunci numaratoarea sa fie de la y la x).
     Atentie la crearea tipului metodei, deoarece metoda afiseaza, nu returneaza.*/

    public void countBetween(int no1, int no2) {
        if (no1 < no2) {
            while (no1 <= no2) {
                System.out.println(no1);
                no1++;
            }
        } else if (no2 < no1) {
            while (no2 <= no1) {
                System.out.println(no2);
                no2++;
            }
        } else System.out.println("The numbers are equal");
    }

    //5. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele pare de la 1 la 100.

    public void showEvenNumbers() {
        int number = 1;
        while (number <= 100) {
            number++;
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    //6. Creati o metoda in clasa LogicalOp care sa afiseze toate numerele impare de la 1 la 100.

    public void showUnevenNumbers() {
        int number = 1;
        while (number < 100) {
            number++;
            if (number % 2 != 0) {
                System.out.println(number);
            }
        }
    }

/*7. Creati o metoda care sa adune toate numerele din intervalul 111 si 8899. Sa se afiseze suma totala, iar dupa aceea sa se calculeze
 si afiseze media numerelor din acel interval. Introduceti o variabila int count in metoda, pentru a numara toate numerele din interval.
 Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza.*/


    public void getSumandAverageW() {
        int a = 111;
        int b = 8899;
        double sum = 0;
        int count = 0;


        while (a <= b) {
            sum = (sum + a);
            a++;
            count++;
        }
        System.out.println(sum);
        double average = sum / count;
        System.out.println("The average of the numbers is " + average);
    }

     /*8. Creati o metoda care sa primeasca doi parametrii de tip numar, si sa returneze media numerelor divizibile cu 7,
     din acel interval. Apelati metoda in clasa Main, metoda main() pentru a verifica daca functioneaza. */

    public float dividebySevenW(int x, int y) {
        float sum = 0;
        float count = 0;

        while (x <= y) {
            if (x % 7 == 0) {
                count++;
                sum = (sum + x);
            }

            x++;
        }
        float average = sum / count;
        return average;
    }

    //9. Creati o metoda care sa afiseze primele 20 de numere din sirul lui Fibonacci.

    public void showFibonacisfirst20no() {
        int count = 20;
        int no1 = 0;
        int no2 = 1;

        int i = 1;
        while (i <= count) {
            System.out.print(no1 + " ");

            int sumOfPrevTwo = no1 + no2;

            no1 = no2;

            no2 = sumOfPrevTwo;

            i++;

        }

    }

    /*
   10. Creati o metoda numita CozaLozaWoza.
Metoda va afisa:
- numerele de la 1 la 110
- 11 numere pe linie
- se va afisa Coza pentru numerele care sunt multiplu de 3 (1 2 Coza 4)
- se va afisa Loza pentru numerele care sunt multiplu de 5 (2 3 4 Loza 6)
- se va afisa Woza pentru numerele care sunt multiplu de 7 (4 5 6 Woza 8)

- se va afisa CozaLoza pentru numerele care sunt multiplu de 3 SI 5
- se va afisa CozaWoza pentru multiplu de 3 SI 7
- se va afisa WozaLoza pentru multiplu de 5 SI 7
- se va afisa CozaLozaWoza pentru multiplu de 3 SI 5 SI 7

Ar trebui sa arate similar:

1 2 Coza 4 Loza Coza Woza 8 Coza Loza 11

Coza 13 Woza CozaLoza 16 17 Coza 19 Loza CozaWoza 22

23 Coza Loza 26 Coza Woza 29 CozaLoza 31 32 Coza
     */
    public void wozaCozaLoza() {

        int i = 1;

        while (i <= 110) {

            if (i % 3 == 0 && i % 5 == 0 && i % 7 == 0) {

                System.out.print("CozaLozaWoza ");

            } else if (i % 5 == 0 && i % 7 == 0) {

                System.out.print("WozaLoza ");

            } else if (i % 3 == 0 && i % 7 == 0) {

                System.out.print("CozaWoza ");

            } else if (i % 3 == 0 && i % 5 == 0) {

                System.out.print("CozaLoza ");

            } else if (i % 7 == 0) {

                System.out.print("Woza ");

            } else if (i % 5 == 0) {

                System.out.print("Loza ");

            } else if (i % 3 == 0) {

                System.out.print("Coza ");

            } else {

                System.out.print(i + " ");

            }

            if (i % 11 == 0) {

                System.out.println();

            }

            i++;
        }

    }
    // LABORATOR 5 - Arrays
    /*2.  In clasa LogicalOp, creati o metoda care sa scrie pe un array de 100 de pozitii, valorile de la 1 la 100.
     Sa se afiseze progresul in consola pe tot parcursul. Apelati metoda in main() pentru a verifica daca
     functioneaza.*/

    public int[] populateArrayUpToNumber(int number) {
        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = i + 1;
        }
        return array;
    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    /*3. Creati o metoda care primeasca un parametru de tip array de numere intregi gol, si sa il returneze
    populat cu toate valorile pare de la 1 la 100. Apelati metoda in main() pentru a verifica daca functioneaza.
    Atentie, metoda returneaza un array, deci acesta va trebui surprins si afisat folosind o bucla. */


    public void Evennumbersarray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                System.out.print(array[i + 1] + " ");

            }
        }

    }

    /*4. Creati o metoda care sa primeasca un parametru de tip array de numere, si sa fie populat cu valori.
    Metoda sa calculeze si sa returneze media numerelor din array. Apelati metoda in main() pentru a verifica
    daca functioneaza.*/
    public double ArrayAverage(int[] array) {

        double sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        return sum / array.length;
    }
    /*5. Creati o metoda care sa primeasca un parametru de tip array de string-uri, populat cu valori,
    si un parametru de tip String. Metoda sa verifice daca valoarea string-ului primit se regaseste in array-ul
     primit, iar daca da sa returneze true iar daca nu, sa returneze false.  Apelati metoda in main() pentru
     a verifica daca functioneaza.*/

    public boolean isValueInmyArray(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /*6. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    si un parametru de tip numar. Metoda sa verifice daca numarul primit se afla in array-ul primit,
    si daca da, atunci sa returneze pozitia pe care se afla numarul.  Apelati metoda in main() pentru a
    verifica daca functioneaza.*/

    public boolean NumberinArray(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                System.out.println(array[i] - 1);
            }
        }
        return true;

    }

    //    7. Creati o metoda care sa afiseze urmatoarea grila, folosind un array:

    public void drawLines() {

        char[] line = {'-', '-', '-', '-', '-', '-', '-', '-', '-', '-',};


        for (int i = 0; i <= 10; i++) {

            System.out.println(line);

        }

    }
 /*8. Creati o metoda care sa primeasca un parametru de tip array de numere, populat cu valori,
    si un parametru de tip numar. Metoda sa verifice daca numarul exista in array, si daca da, sa returneze array-ul
     primit, fara acel numar. Apelati metoda in main() pentru a verifica daca functioneaza.*/

    public int[] removeNrFromArray(int[] myarray2, int nr) {

        int[] secondArray = new int[myarray2.length];

        int j = 0;

        for (int i = 0; i < myarray2.length; i++) {

            if (myarray2[i] == nr)

                continue;

            secondArray[j++] = myarray2[i];

        }

        int[] finArray = new int[j];


        for (int i = 0; i < j; i++)

            finArray[i] = secondArray[i];

        return finArray;

    }


    //    10. Creati o metoda care sa primeasca doi parametrii: un array populat cu valori, si un array gol.

//    Metoda sa copieze toate valorile din primul array, parcurgandu-l, in cel de-al doilea.

    public int[] copyArray(int[] firstArray, int[] emptyArray) {


        for (int i = 0, j = 0; i < firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;

        }

        return emptyArray;

    }

    public void PrintcopyArray(int[] firstArray, int[] emptyArray) {
        for (int i = 0, j = 0; i <= firstArray.length; i++) {

            emptyArray[j] = firstArray[i];

            j++;
            System.out.println(emptyArray[j]);
        }

    }


    // LAB6
    //EX 1 in main 6
    //Ex 2Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru sa fie o lista de numere,
    // si celalalt un numar (real sau intreg). Metoda sa adauge numarul primit ca si parametru la final de lista.

    public void addgivennumbertomylist(List<Integer> myListofInt, int a) {
        myListofInt.add(a);
        System.out.println(myListofInt);

    }
    // 3.Scrieti o metoda Java, care sa primeasca doi parametrii: un parametru de tip Lista,
    // iar celalalt un numar intreg. Sa se parcurga lista si sa afiseze, pe rand, toate valorile din lista,
    // fiecare pe rand nou, pornind de la numarul intreg primit ca si parametru.

    public void printnumberfrombonwards(List<Integer> myListofInt, int position) {
        for (int i = position; i < myListofInt.size(); i++)
            System.out.println(myListofInt.get(i));
    }


    //4 Scrieti o metoda Java,care sa primeasca parametru o Lista,si sa afiseze, pe rand, toate valorile
    // din lista,dar invers(de la capat la inceput).
    public void printNumbersBackwardsFromList(List<Integer> myList) {
        for (int i = myList.size() - 1; i >= 0; i--) {
            System.out.println(myList.get(i));

        }

    }
    //5 Scrieti o metoda Java, care sa primeasca trei parametrii: unul de tip Lista de String-uri, unul de
    //  tip intreg, si unul de tip String. Metoda sa adauge parametrul de tip String in lista primita, iar
    //  parametrul de tip intreg reprezinta pozitia la care sa fie pus acel String.

    public void addStringToMyList(List<String> myList, int index, String text) {

        myList.add(index, text);
        System.out.println(myList);

    }


    //6Scrieti o metoda Java, care sa primeasca doi parametrii. Primul dintre ei va fi o Lista,
    // iar metoda sa ia al doilea parametru si sa il adauge pe prima pozitie din lista.
    public void addCatthebeginningofmyList(List<Integer> myListofInt, int c) {
        myListofInt.add(0, c);
        System.out.println(myListofInt);
    }


    //8  Scrieti o metoda Java care sa primeasca o Lista si sa returneze cel mai mare numar din ea.

    public int getHighestNumber(List<Integer> list) {
        int max = list.get(0);
        for (int x : list) {
            if (x > max) {
                max = x;
            }
        }
        return max;
    }

    //5.In clasa LogicalOp, creati o metoda care sa primeasca un array de numere ca si parametru, si un numar.
    // Fara a folosi conditii, si folosind un try-catch, afisati valoarea de pe pozitia numarului primit,
    // iar daca valoarea numarului este mai mare decat numarul de pozitii din array, afisati textul: "Inside catch, number too large".

    public void readArrayIndex(int[] array, int number) {
        try {
            System.out.println(array[number]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Inside catch, number too large");
        }
    }
    //6. In clasa LogicalOp, creati o metoda  'wait()'.
    // Metoda sa nu returneze nimic, dar sa primeasca un parametru de tip int. In interiorul ei,
    // tratati metoda Thread.sleep(), astfel incat metoda noastra sa primeasca valoarea in secunde, cat sa astepte.
    // Ex: wait(5) -> asteapta 5 secunde.
    public void wait(int seconds){
        try {
            Thread.sleep(seconds * 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}


























