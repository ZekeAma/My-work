package codingBot;

/**
 * The CodingBot class provides methods for string manipulation.
 */
public class CodingBot {

    /**
     * Generates a new string composed of the characters that appear 
     * immediately before and after every occurrence of the specified 
     * word in the given string.
     *
     * @param str  the input string in which to search for occurrences of the word.
     * @param word the word to search for within the input string.
     * @return a new string made up of characters surrounding each occurrence 
     *         of the specified word in the input string. If an occurrence is 
     *         at the beginning or end of the string, only the adjacent character 
     *         is included.
     */
    public String wordEnds(String str, String word) {
        StringBuilder result = new StringBuilder();
        int wordLen = word.length();
        int strLen = str.length();

        for (int i = 0; i <= strLen - wordLen; i++) {
            if (str.substring(i, i + wordLen).equals(word)) {
            
                if (i > 0) {
                    result.append(str.charAt(i - 1));
                }
           
                if (i + wordLen < strLen) {
                    result.append(str.charAt(i + wordLen));
                }
              
                i += wordLen - 1;
            }
        }

        return result.toString();
    }
}
