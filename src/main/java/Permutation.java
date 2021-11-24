import java.util.Arrays;

public class Permutation {
    static String sortString(String str){
        char[] sorted = str.toCharArray();
        Arrays.sort(sorted);
        return new String(sorted);
    }
    static boolean sortPermutation (String str1, String str2){
        String sorted1 = sortString(str1);
        String sorted2 = sortString(str2);
        return sorted1.equals(sorted2);
    }
}
