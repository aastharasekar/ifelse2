import java.util.*;
class Q5{
    public static void main(String[] args) {
        
        System.out.println("Enter a decimal value: ");
        Scanner sc = new Scanner(System.in);
        float Num = sc.nextFloat();

        if(Num % 6 == 0){
            System.out.println(Num + " is divisible by 6");
        }
        else{
            System.out.println(Num + " is not divisible by 6");
        }
    }

} 
    

