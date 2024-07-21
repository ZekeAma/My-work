package recursion;

/**
 * The Recursion class provides a collection of methods to demonstrate recursive techniques.
 */
public class Recursion {
    
    /**
     * Calculates the sum of the digits of a given integer.
     * If the integer is negative, it treats it as positive by converting it to its absolute value.
     *
     * @param n the integer whose digits are to be summed
     * @return the total sum of the digits
     */
    public static int sumOfDigits(int n) {
        if (n == 0) {
            return n;
        }
        if (n < 0) {
            return sumOfDigits(n * -1);
        }
        return (n % 10) + sumOfDigits(n / 10);
    }

    /**
     * Counts the number of smiley faces (represented by a colon followed by a closing parenthesis)
     * in a given array of characters, starting from a specified index.
     *
     * @param letters the array of characters to search through
     * @param index the current position in the array to check
     * @return the number of smiley faces found in the array
     */
    public static int countSmiles(char[] letters, int index) {
        // Base case: if the index exceeds the array bounds or there's no space for a smiley face
        if (index >= letters.length - 1) {
            return 0;
        }

        // Check if the current character and the next character form a smiley face
        if (letters[index] == ':' && letters[index + 1] == ')') {
            return 1 + countSmiles(letters, index + 1); // Increment count and move to next index
        } else {
            return countSmiles(letters, index + 1); // Move to next index
        }
    }

    /**
     * Converts all lowercase letters in the provided string to uppercase and inserts a space
     * between each character.
     *
     * @param input the string to be transformed
     * @return the transformed string with uppercase characters and spaces between each character
     */
    public static String convertToUpperAndSeparate(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder modifiedString = new StringBuilder();

        for (char character : input.toCharArray()) {
            if (Character.isLowerCase(character)) {
                character = Character.toUpperCase(character);
            }
            modifiedString.append(character).append(' ');
        }

        // Remove the trailing space
        return modifiedString.toString().trim();
    }
}
