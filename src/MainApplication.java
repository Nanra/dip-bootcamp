public class MainApplication {

    public static void main(String[] args) {

        // Instance Object
        TextConverter changeText = new TextConverter();

        // Set Value Variable Attribute
        changeText.setYourText("Hi, I'm A Java Programmer");

        // Get Value Variable Attribute
        String yourInputText = changeText.getYourText();

        // Call Method Text Convert
        String yourTextConverted = changeText.textToUpperCase();

        // Print Output Information
        System.out.println("Text Before Convert: " + yourInputText);
        System.out.println("Text After Convert: " + yourTextConverted);
    }
}
