import io.InputReader;
import io.PrintOutput;

public class MainApplication {

    public static void main(String[] args) {

        // Instance Object
        InputReader userInput = new InputReader();
        PrintOutput output = new PrintOutput();

        // Read String User Name
        output.printString("Please Enter Your Name: ");
        String username = userInput.readText();

        // Read String User Age
        output.printString("Please Enter Your Age: ");
        String userAge = userInput.readText();

        // Show User Information
        output.printString("Hello " + username + " your Age is " + userAge +" yo");
    }
}
