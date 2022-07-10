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




               /* 8
               int[] numbersarray = {14,56,102,55,8900,4000,1,2,3};
               int number2 = 14;
               System.out.println(op.NoinArray2(numbersarray,number2));*/





                   //9
                    int[]array ={10,-5,20,999};
                    Arrays.sort(array);
                    int min2 = array[1];
                    System.out.println(min2);

               }


    }




