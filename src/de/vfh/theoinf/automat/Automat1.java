package de.vfh.theoinf.automat;

public class Automat1 {
    public static int nextState(int state, char input) {
        int[][] dest = {{1, 1, 1, 3, 4},{0, 2, 0, 3, 4},{0, 0, 3, 3, 4}};
        if (input < 'a' || input > 'c') {
            return 4;
        }
        return dest[input-'a'][state];
    }
    public static boolean accept (String word) {
        return word.matches("([abc])*(abc)([abc])*");
    }
}
