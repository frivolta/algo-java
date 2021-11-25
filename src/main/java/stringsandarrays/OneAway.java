package stringsandarrays;

import java.util.Arrays;

public class OneAway {
    public boolean checkString(String string1, String string2) {
        if (string1.length() == string2.length()) {
            return oneEditReplace(string1, string2);
        } else if (string1.length() + 1 == string2.length()) {
            return oneEditInsert(string1, string2);
        } else if (string2.length() + 1 == string1.length()) {
            return oneEditInsert(string2, string1);
        }
        return false;
    }

    boolean oneEditInsert(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    boolean oneEditReplace(String s1, String s2) {
        boolean difference = false;
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                if (difference == true) {
                    return false;
                }
                difference = true;
            }
        }
        return true;
    }
}
