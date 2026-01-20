import java.util.Arrays;

public class P66PlusOne {

    public static void main(String[] args) {
        int[] digits = {9,9,9};
        System.out.println(Arrays.toString(plusOne(digits)));
    }
    public static int[] plusOne(int[] digits) {
        int len = digits.length;
        for(int i = len-1 ; i>=0 ; i-- ){
            if(digits[i]<9){
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }
        int[] res = new int[len+1];
        res[0] = 1;
        return res;
    }
}