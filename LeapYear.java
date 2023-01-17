public class LeapYear {
    public static void main(String[] args) {
        int lb=999;
        int ub=2010;
        for(int i=lb; i<= ub; i++){
            if(i%4==0 && i % 100 != 0 || i%400 == 0){
                System.out.println("Leap year " + i);
            }
        }
    }
}
