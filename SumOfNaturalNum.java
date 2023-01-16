import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of natural numbers: ");
        int n = in.nextInt();
        int sum=0;
        for(int i=1; i <= n; i++){
            sum += i;
        }
        System.out.println("Sum is : " + sum);
    }
}
