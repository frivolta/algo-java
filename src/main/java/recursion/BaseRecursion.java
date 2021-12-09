package recursion;

public class BaseRecursion {
    public String reverseString(String input){
        if(input==""){
            return "";
        }
        return reverseString(input.substring(1))+input.charAt(0);
    }

    public boolean palindrome(String input){
        // base case
        if(input.length() ==0 || input.length()==1){
            return true;
        }
        if(input.charAt(0) == input.charAt(input.length()-1)){
           return palindrome(input.substring(1, input.length()-1));
        }
        return false;
    }

    public int sumOfnaturalNumbers(int input){
        if(input==0){
            return 0;
        }
       return sumOfnaturalNumbers(input-1)+input;
    }

    public int binarySearch(int[] A, int left, int right, int x){
        if(left>right){
            return -1;
        }
        int mid = (left+right)/2;
        if(A[mid] == x){
            return mid;
        }
        if(x<A[mid]){
            return binarySearch(A, left, mid-1, x);
        }
        return binarySearch(A, right, mid+1, x);
    }

}
