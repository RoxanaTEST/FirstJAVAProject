import java.util.ArrayList;
import java.util.List;

public class Main6 {

    public static void main(String[] args) {


        List<Integer> myListOfInt = new ArrayList<>();
        //Integer y = 3;
        //ca sa adaug o valoare:

        //myListOfInt.add(3);

        // ca sa vezi valoarea de pe o pozitie :
        //System.out.println(myListOfInt.get(0));

        // ca sa scot un element din lista:
        //myListOfInt.remove(y);

        //SAU
        //myListOfInt.remove(Integer.valueOf(3));

        //cum pun valori pe anumite pozitii?(prima data pozitia dupa valoarea)
        //myListOfInt.add(0,3);
        //myListOfInt.add(1,99);
        //myListOfInt.add(2,45);
        //myListOfInt.add(3,60);
        //myListOfInt.add(4,10);
        //myListOfInt.add(5,1000);
        //cum suprascriu valori pe anumite pozitii?(prima data pozitia dupa valoarea)
        //myListOfInt.set(1,300);//set face update
        //myListOfInt.add(5,7000);//add face insert


        // System.out.println();
        // System.out.println(myListOfInt.size());

        //1
        for (int i = 1; i <= 30; i++) {
            myListOfInt.add(i);
        }
        for (int value : myListOfInt) {
            System.out.println(value);
        }

        //2

        LogicalOperators op = new LogicalOperators();

       op.addgivennumbertomylist(myListOfInt, 70);

        // 3


        op.printnumberfrombonwards(myListOfInt, 100);

        //4
        op.printNumbersBackwardsFromList(myListOfInt);

        //5

        //6
        op.addCatthebeginningofmyList(myListOfInt,90);

        //7

        //8
        List<Integer> list = new ArrayList<>();
        list.add(29);
        list.add(70);
        list.add(1000000);
        list.add(2);
        list.add(500);
        list.add(25);

        System.out.println(op.getHighestNumber(list));



    }

}











