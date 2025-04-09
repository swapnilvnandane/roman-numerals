import java.util.Map;

/*
 * RomanNumerals.java
 * This class provides a method to convert a string of Roman numerals into its shortest equivalent.
 * It handles the conversion of various combinations of Roman numeral characters.
 */
public class RomanNumerals {

    /*
     * This method takes a string of Roman numerals and converts it into its shortest equivalent.
     * It uses a map to define the values of each Roman numeral character.
     */
    private static final Map<String, Integer> map = Map.of(
            "I", 1,
            "V", 5,
            "X", 10,
            "L", 50,
            "C", 100,
            "D", 500,
            "M", 1000
    );

    /*
     * This method converts a string of Roman numerals into its shortest equivalent.
     * It first calculates the total value of the Roman numerals and then constructs
     * the shortest representation using the appropriate characters.
     */
    public static String createShortNumeral(String longRomanNumerals) {
        int result = extracted(longRomanNumerals);
        StringBuilder sb = new StringBuilder("");
        int div = 0;

        if (result >= 1000) {
            div = result / 1000;
            for (int k = 0; k < div; k++)
                sb.append('M');
            result = result % 1000;
        }

        if (result >= 500) {
            div = result / 500;
            for (int k = 0; k < div; k++)
                sb.append('D');
            result = result % 500;
        }

        if (result >= 100) {
            div = result / 100;
            for (int k = 0; k < div; k++)
                sb.append('C');
            result = result % 100;
        }

        if (result >= 50) {
            div = result / 50;
            for (int k = 0; k < div; k++)
                sb.append('L');
            result = result % 50;
        }

        if (result >= 10) {
            div = result / 10;
            for (int k = 0; k < div; k++)
                sb.append('X');
            result = result % 10;
        }

        if (result >= 5) {
            div = result / 5;
            for (int k = 0; k < div; k++)
                sb.append('V');
            result = result % 5;
        }

        if (result >= 1) {
            div = result / 1;
            for (int k = 0; k < div; k++)
                sb.append('I');
            result = result % 1;
        }
        return sb.toString();
    }

    /*
     * This method calculates the total value of a string of Roman numerals.
     * It iterates through each character in the string and sums up their values
     * based on the predefined map.
     */
    private static int extracted(String longRomanNumerals) {
        int result = 0;
        for (int i = 0; i < longRomanNumerals.length(); i++) {
            result += map.get(String.valueOf(longRomanNumerals.charAt(i)));
        }
        return result;
    }
}
