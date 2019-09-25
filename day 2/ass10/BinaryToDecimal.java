/**
 * Given a binary string that contains a sequence of 1's and 0's, returns an
 * equivalent to the decimal value in integer form.
 * 
 * Input : 1010
 * Output : 10
 * 
 * Input : 000000000000001010
 * Output : 10
 * 
 * @author Siva Sankar
 */

public class BinaryToDecimal {

    /**
     * This method reads in a Binary String and returns the equivalent to the
     * decimal value of the binary string.
     * @param s, the binary string that contains only sequence of 1's and 0's.
     * @return the decimal number n of the binary string.
     */
    public static int binaryToDecimal(String s) {
        int decimal=0;
        char[] number=s.toCharArray();
        int base=1;
        int len=number.length;
        for(int i=len-1;i>=0;i--){
            if (number[i]=='1')
            decimal+=base;
            base=base*2;
        }
        return decimal;
    }
    public static void main(String[] args){
        System.out.println(binaryToDecimal("11110101010101010"));
    }
        
        
        
    
}