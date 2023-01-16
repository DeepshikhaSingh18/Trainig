import java.util.*;
public class SumOfNaturalNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter no. of natural numbers: ");
        //int n = in.nextInt();
        int lb=1;
        int up=10;
        int product = 1;
        for (int i = lb; i <= up; i++) {

                product *= i;
        }
        System.out.println("Product is : " + product);
    }
}