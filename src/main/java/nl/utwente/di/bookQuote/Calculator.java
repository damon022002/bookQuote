package nl.utwente.di.bookQuote;

public class Calculator {
    public double calculate(String number) {
        try {
            int yeet = Integer.parseInt(number);
            return yeet;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return -1000;
        }
    }
}
