import java.util.*;
class Q2{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        int num = sc.nextInt();

        if(num % 13 == 0 ){
            System.out.println(num +" is in table of 13");
        }
        else{
            System.out.println(num +" is not in table of 13");
        }
    }
}