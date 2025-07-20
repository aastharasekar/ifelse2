import java.util.*;
class Q4{
    public static void main(String[] args) {
        System.out.println("Enter your percentage in decimal: ");
         Scanner sc = new Scanner(System.in);
         float percentage = sc.nextFloat();

         

         if(percentage >= 92.00){
            System.out.println("Medical");
         }
         else if(percentage <= 85.00 && percentage >= 75.00){
            System.out.println("Engineering");
         }
         else if(percentage <= 75.00 && percentage >= 65.00){
            System.out.println("pharmacy or bachelor of Science");
         }

} 
}
