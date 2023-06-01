

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
public class Main7 {

    public static void main(String[] args) {
        Read read = new Read();
        LogicalOperators logicalOp = new LogicalOperators();
         double x = read.getDouble();
        System.out.println(x);

         int y = read.getInt();
        System.out.println(y);

         float z = read.getFloat();
        System.out.println(z);

         long w = read.getLong();
        System.out.println(w);

        int[] array = read.getPopulatedArray(4);
        for (int i : array) {
            System.out.println(i);

            List<Integer> list = read.getPopulatedList();
            System.out.println(list);

            array = new int[]{1, 2, 3, 4};
            logicalOp.readArrayIndex(array, 7);

            logicalOp.wait(10);
        }
    }
}














