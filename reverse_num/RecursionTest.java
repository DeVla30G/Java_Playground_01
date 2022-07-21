package reverse_num;

import java.util.Scanner;

public class RecursionTest {
    
    public static void revNum(int number) {
        if(number < 10) {
            System.out.println(number);
            return;
        }else {
            System.out.print(number % 10);
            revNum(number/10);
        }
        
    }
    public static void main(String[] args) {
        System.out.println("Enter a number to test the reverse: ");
        Scanner sc = new Scanner(System.in); 
        int num = sc.nextInt();
        sc.close();
        System.out.print("The revese number is: ");
        revNum(num);
        
    }
}
