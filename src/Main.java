import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader userInputReader = new BufferedReader(new InputStreamReader(System.in)); // the object responsible for reading user input
        System.out.println("Please enter your first number:");
        int firstNumber = Integer.parseInt(userInputReader.readLine()); // Save first number to a variable
        System.out.println("Please enter your second number:");
        int secondNumber = Integer.parseInt(userInputReader.readLine()); // Save second number to a variable

        int solvedEquation = firstNumber + secondNumber;

        System.out.printf("%s + %s = %s%n", firstNumber, secondNumber, solvedEquation);
    }
}
