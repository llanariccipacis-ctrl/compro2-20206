import java.util.Scanner;
public class Array1 {
    public static void main(String[] args) {

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        //Display
        for (int i = 0; i < numbers.length; i++ ) {
            System.out.print(numbers[i] + ", ");
        }

        Scanner input = new Scanner(System.in);

        System.out.println();

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        //Find the number in the array numbers[], then if number is present, display its index
        
        boolean isTrue = true;

        int i = 0;
        while (isTrue){ //Ayusin

            if (numbers[i] == number) {
                System.out.println("The index is " + i); //Polish
                isTrue = false;
            } //Break the loop if wala yung number

            i++;
        }

        for (int k = 0; i < numbers.length; k++) {
            if ()

        }

        
    }

}