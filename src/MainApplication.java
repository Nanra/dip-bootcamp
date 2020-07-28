import calculator.MainCalculator;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class MainApplication {

    public static void main(String[] args) {

        // Instance Object
        MainCalculator calculator = new MainCalculator();

        // Declaration All Operation
        BigDecimal multiplication = calculator.multiplication(new BigDecimal(10), new BigDecimal(2));
        BigDecimal addition = calculator.addition(new BigDecimal(10), new BigDecimal(20));
        BigDecimal divide = calculator.divide(new BigDecimal(60), new BigDecimal(3));
        BigDecimal subtraction = calculator.subtraction(new BigDecimal(50), new BigDecimal(25));

        // Add All Operations to Map
        HashMap<String, BigDecimal> allOperations = new HashMap<String, BigDecimal>();
        allOperations.put("Multiplication", multiplication);
        allOperations.put("Addition", addition);
        allOperations.put("Divide", divide);
        allOperations.put("Subtraction", subtraction);

        // Show All Operations Output
        for (Map.Entry data: allOperations.entrySet()) {
            System.out.println(data.getKey().toString() + " Result = " + data.getValue());
        }
    }
}
