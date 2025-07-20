import java.util.*;
class Q8 {
    public static void main(String[] args) {
        
        System.out.println("Enter your percentage: ");
        Scanner sc = new Scanner (System.in);
        float percentage = sc.nextFloat();

        if(percentage >=75.00)
        {
            System.out.println("First class with distinction");
        }
        else if(percentage >=60.00 && percentage < 75.00){
            System.out.println("First class");
        }
        else if(percentage >=50.00 && percentage < 60.00){
            System.out.println("Second class");
        }
        else if(percentage > 45.00 && percentage <50.00){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
