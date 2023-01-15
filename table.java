import java.util.*;
public class table {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number = in.nextInt();
        //for(int i=number; i<=number*10; i+=number){
          //  System.out.println(number + "x" +i/number+ "=" +i);
        //}
        for(int i=0; i<= 10; i++){
            System.out.println(number +" x " +i+ "="+ i*number);
        }
    }
}
