package reverse_num;

public class loopTest {
    
    public static void main(String[] args) {
        int number = 7353, reverse = 0;

        for (;number != 0; number= number/10){
            int remainder = number%10;
            reverse = reverse*10 + remainder;
        }
        System.out.println("The reverse number is:" + reverse);
    }
}
