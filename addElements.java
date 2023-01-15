import java.sql.SQLOutput;
import java.util.*;
public class addElements {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter size of an array ");
        int a = in.nextInt();

        System.out.println("Enter the element: ");
        int arr[] = new int[a];
        int n = arr.length;
        for(int i=0; i< n; i++){
            arr[i] = in.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println(arr[i]);
        }





    }
}
