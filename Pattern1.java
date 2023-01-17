import java.util.*;
public class Pattern1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        // Right triangle
        for(int row=0; row<n; row++){
            for(int col=0; col<row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int row=n-1; row>=0; row--){
            for(int col=0; col<=row; col++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
