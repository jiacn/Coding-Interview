public class UniqueChars {
    boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            System.out.println(val);
            if (char_set[val]) {
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
    public static void main(String[] args) {
        HelloWorld h = new HelloWorld();
        String s = "abcdefgZ";
        boolean unique = h.isUniqueChars(s);
        System.out.print(unique);
    }
}