
import java.util.*;
class Q1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        if(1 <= num && num <= 1000){

            System.out.println(num + " is within the range 1 to 1000");

        }
        else{
            System.out.println(num + " is not in the range of 1 to 1000");
        }

        
    }
}