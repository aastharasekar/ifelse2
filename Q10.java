import java.util.*;
class Q10 {
    public static void main(String[] args) {
        System.out.println("Lets know How much Pretty you are");
        System.out.println("Enter your age: ");
        Scanner sc = new Scanner (System.in);
        int age =sc.nextInt();

        if(age >=65 && age <= 100){
            System.out.println("OMG... You are so Gorgeous ^_^ !!!");
        }
        else if(age >=30 && age < 65){
            System.out.println("Hiii You are soo Beautifull :)");
        }
        else if(age >= 18 && age < 30){
            System.out.println("Heyy Smarty you are pretty as always :)");
        }
        else if(age < 18 && age >= 0){
            System.out.println("Hello kiddo you are a cutie !");
        }
        else if(age < 0){
            System.out.println("Invalid age input.");
        }
    }
    
}
