/**
 * Check Permutation
 * Created by Jia on 2017/4/21.
 */
public class Permutation {
    String sort(String s) {
        char[] content = s.toCharArray();
        java.util.Arrays.sort(content);
        return new String(content);
    }

    boolean permutation(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        return sort(s).equals(sort(t));
    }

    public static void main(String[] args) {
        String s = "god";
        String t = "dog";
        Permutation p = new Permutation();
        boolean result = p.permutation(s, t);
        System.out.print(result);
    }
}
