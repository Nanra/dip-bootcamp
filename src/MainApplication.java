public class MainApplication {

    public static void main(String[] args) {

        // Variables Declaration
//        Scanner inputScanner = new Scanner(System.in);
//        int visitorCounter = 10;
//        System.out.print("Please enter your name: ");
//        String visitorName = inputScanner.nextLine();
//        String greetingsText = "Hello " + visitorName + ", You are the number " + visitorCounter + " visitor of Our Store";
//
//        // Running Program
//        System.out.println(greetingsText);

        // Text Output Converter Example
//        TextConverter changeText = new TextConverter();
//        changeText.yourText = "name";

//        changeText.setYourText("name");

//        System.out.println(changeText.getYourText());
//        System.out.println(changeText.textToUpperCase());

        // User Input Example
        InputReader userInput = new InputReader();
        PrintOutput userOutput = new PrintOutput();

        // Read String User Name
        System.out.print("Insert Your Name: ");
        String userName = userInput.readText();

        // Read Integer User age
        System.out.print("Insert Your Age: ");
        int userAge = userInput.readNumber();

        // Print User Information
        userOutput.printString(userName);
        userOutput.printNumber(userAge);

    }
}
