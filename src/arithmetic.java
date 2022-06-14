import java.util.Scanner;

class arithmetic{
    public static void main(String[] args) {
        Scanner numbers = new Scanner(System.in);
        int total = 0;
        int grade;
        int average;
        int counter = 0;

        while (counter < 3 ){
            grade = numbers.nextInt();
            total = total + grade;
            counter++;
        }
        average = total / 3;
        System.out.println("Your average is "+average);

    }
}
