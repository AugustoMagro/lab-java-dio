import java.util.Locale;
import java.util.Scanner;

public class LabOne {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        Calculator calculator = new Calculator();

        int number = 10;
        int secondNumber = 11; 
        
        System.out.println(number);

        // If and Else Abreviation (Third operator)
        String result = number==secondNumber ? "True" : "False";
        System.out.println(result);

        // Getting input from users
        System.out.println("Type the first number");
        int number1 = scanner.nextInt();

        System.out.println("Type the second number");
        int number2 = scanner.nextInt();

        // Using functions
        System.out.println(calculator.sum(number1, number2));
        System.out.println(calculator.times(number1, number2));
        System.out.println(number1 + "10");

    }
}
