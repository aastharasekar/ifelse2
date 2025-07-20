import java.util.*;
class Q6 {
    public static void main(String[] args) {
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner (System.in);
        int age =sc.nextInt();

        if(age >= 18){
            System.out.println("You are eligible to vote.");
        }
        else if(age < 18 && age >= 0){
            System.out.println("You are not eligible to vote.");
        }
        else if(age < 0){
            System.out.println("Invalid age input.");
        }
    }
    
}
