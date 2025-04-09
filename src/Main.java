
/*
 * RomanNumerals.java
 * This class provides a method to convert a string of Roman numerals into its shortest equivalent.
 * It handles the conversion of various combinations of Roman numeral characters.
 */
public class Main {

    /*
     * This method takes a string of Roman numerals and converts it into its shortest equivalent.
     * It uses a map to define the values of each Roman numeral character.
     */
    public static void main(String[] args) {
        System.out.println(RomanNumerals.createShortNumeral("LLLXXXVVVV").equals("CC")); // 200 = CC
        System.out.println(RomanNumerals.createShortNumeral("VVVV").equals("XX"));            // 20 = XX
        System.out.println(RomanNumerals.createShortNumeral("IIII").equals("IIII"));          // 4 = IIII
        System.out.println(RomanNumerals.createShortNumeral("MMMM").equals("MMMM"));          // 4000 = MMMM
        System.out.println(RomanNumerals.createShortNumeral("").equals(""));                  // empty input = ""
        System.out.println(RomanNumerals.createShortNumeral("X").equals("X"));                // 10 = X
        System.out.println(RomanNumerals.createShortNumeral("XIIII").equals("XIIII"));        // 14 = XIIII
        System.out.println(RomanNumerals.createShortNumeral("DD").equals("M"));               // 1000 = M
    }
}