/**
 * Created by Jia on 2017/4/21.
 * Write a method to replace all spaces in a string
 * with '%20', and you are given a true length of the
 * string. 
 * EXAMPLE:
 * Input:    "Mr John Smith   ", 13
 * Output:   "Mr%20John%20Smith"
 * 
 */
public class URLify {
    void replaceSpaces(char[] str, int trueLength) {
        int spaceCount = 0, index, i;
        for (i=0; i < trueLength; i++) {
            if (str[i] == ' '){
                spaceCount++;
            }
        }
        index = trueLength + spaceCount * 2;
        if (trueLength < str.length) str[trueLength]='\0';
        for (i = trueLength - 1; i >= 0; i--) {
            if (str[i] == ' ') {
                str[index-1] = '0';
                str[index-2] = '2';
                str[index-3] = '%';
                index = index -3;
            } else {
                str[index-1] = str[i];
                index--;
            }
        }
    }
    public static void main(String[] args) {
        URLify u = new URLify();
        String s = "Mr John Smith    ";
        char[] chars = s.toCharArray();
        u.replaceSpaces(chars, 13);
        System.out.print(chars);
    }
}
