import java.util.Arrays;

public class Main5 {

    public static void main(String[] args) {
        LogicalOperators op = new LogicalOperators();

           //2
            int[] myArray = op.populateArrayUpToNumber(100);
            op.printArray(myArray);
            //3
            op.Evennumbersarray(myArray);
            //4
            System.out.println(op.ArrayAverage(myArray));

            //5
            String[] myArrayOfStrings = {"mere","pere","portocale","pepene"};
            System.out.println();
                if (op.isValueInmyArray(myArrayOfStrings, "mango"))
            System.out.println("Valoarea e in array");
                else
            System.out.println("valoarea nu e in array");


              //6
               int[] numbersarray = {1,2,3,4,5};
               int number = 5;
               op.NumberinArray(numbersarray,5);


               //7

               op.drawLines();


               // 8
               int[] myarray2 = {14,56,102,55,8900,4000,1,2,3};
               int nr = 14;
               op.removeNrFromArray(myarray2,nr);






                   //9
                    int[]array ={10,-5,20,999};
                    Arrays.sort(array);
                    int min2 = array[1];
                    System.out.println(min2);


                    //10
        int[]firstArray = {67,99,44,5};
        int[]emptyArray = firstArray;

        op.PrintcopyArray(firstArray,emptyArray);

               }


    }








