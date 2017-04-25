/**
 * Created by Jia on 2017/4/25.
 * Given a string, write a function to check if
 * it is a permutation of a palindrome.
 * A palindrome is a word or phrase that is  the
 * same forward and backward.
 * EXAMPLE:
 * Input:    Tact Coa
 * Output:   True
 *  (Permutations: "taco cat", "atco cta", etc.)
 */
public class Palindrome {
    public boolean isPermutationOfPalindrome(String phrase) {
        int[] table = buildCharFrequencyTable(phrase);
        return checkMaxOneOdd(table);
    }

    /* Check that no more than one character has an odd count */
    boolean checkMaxOneOdd(int[] table) {
        boolean foundOdd = false;
        for (int count:table) {
            if (count % 2 ==1) {
                if (foundOdd) {
                    return false;
                }
                foundOdd = true;
            }
        }
        return foundOdd;
    }

    /* Map each character to a number. a -> 0, b -> 1, c ->2, etc.
     * This is case insensitive. Non-letter characters map to -1.
     */
    int getCharNumber(Character c) {
        int a = Character.getNumericValue('a');
        int z = Character.getNumericValue('z');
        int val = Character.getNumericValue(c);
        if ( a <= val && val <= z) {
            return val - a;
        }
        return -1;
    }

    /* Count how many times each character appears. */
    int[] buildCharFrequencyTable(String phrase) {
        int[] table = new int[Character.getNumericValue('z') -
                            Character.getNumericValue('a') + 1];
        //int begin = Character('a');
        for (char c : phrase.toCharArray()) {
            int x = getCharNumber(c);
            if (x != -1) {
                table[x]++;
            }
        }
        return table;
    }
    public static void main(String[] args) {
        Palindrome p = new Palindrome();
        String s = "bob";
        boolean result = p.isPermutationOfPalindrome(s);
        System.out.print(result);
    }
}
