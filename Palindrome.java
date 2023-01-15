import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = in.nextInt();
        int rev =0;
        int temp = num;
        while(num > 0){
            int rem = num % 10;

            rev = rev * 10 + rem;
            num = num / 10;

        }
        System.out.println("Reverse number " + rev);
        if (temp == rev) {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is  not palindrome");
        }
    }
}
