package stringsandarrays;

public class CompressInPlace {
    public String compressString(String str){
        StringBuilder compressedString = new StringBuilder();
        char current = str.charAt(0);
        int currentCount = 0;

        for(int i=0; i<str.length(); i++){
            if(current==str.charAt(i)){
                currentCount++;
            }else{
                compressedString.append(current).append(currentCount);
                current = str.charAt(i);
                currentCount = 1;
            }
            if(str.length()-1 == i){
                compressedString.append(current).append(currentCount);
            }
        }
        return compressedString.toString().length()<str.length()?compressedString.toString():str;
    }
}
