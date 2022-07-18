package reverse_num;

import java.util.*;

public class Reverse4 {

public static int revNum(int number) {
    boolean isNoNeg = number < 0 ? true:false;
    if(isNoNeg) {
        number = number* -1; // makes positive if negative
    }
    int reverse = 0;
    int lastDigit = 0;
    while (number >= 1){
        lastDigit = number% 10;
        reverse = reverse*10 + lastDigit;
        number = number/10;
    }
    return isNoNeg == true? reverse*-1: reverse;
}


 public static void main(String[] args) {
    System.out.println("Enter a number to test the reverse: ");
    Scanner sc = new Scanner(System.in); 
    int num = sc.nextInt();
    sc.close();
   int rev_num = revNum(num);
   System.out.println("The reverse number is:" + rev_num);
 }  
}
