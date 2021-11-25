package stringsandarrays;

import java.util.Arrays;
import java.util.HashMap;
import java.util.function.Function;

public class Compress {
    static String sortString(String str){
        char[] temp = str.toCharArray();
        Arrays.sort(temp);
        return new String(temp);
    }

    static String hashString(String str){
        HashMap<Character, Integer> charCountMap
                = new HashMap();
        StringBuilder stringFromHash = new StringBuilder();

        for (int i = 0; i< str.length(); i++){
            if(charCountMap.containsKey(str.charAt(i))){
                charCountMap.put(str.charAt(i), charCountMap.get(str.charAt(i))+1);
            }else{
                charCountMap.put(str.charAt(i), 1);
            }
        }

        charCountMap.forEach((k,v)->{
            stringFromHash.append(k.toString()+v.toString());
        });

        return stringFromHash.toString();
    }


    public String compressString(String str){
       String sorted = sortString(str);
       String withCount = hashString(sorted);
       if(withCount.length()<str.length()) {
           return withCount;
       }else{
           return str;
       }
    }
}
