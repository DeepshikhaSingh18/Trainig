import java.util.*;
public class Armstrong {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int number=in.nextInt();
        int result = 0;
        int num = number;
        while(num!=0){
            int r=num%10;
            result += Math.pow(r,3);
            num = num/10;

    }
if(result==number){
    System.out.println("is armstrong");
}
else{
    System.out.println("not armstrong");
}


    }

}
