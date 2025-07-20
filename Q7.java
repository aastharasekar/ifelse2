import java.util.*;
class Q7 {
    public static void main(String[] args) {
        System.out.println("Enter sellingPrice: ");
         Scanner sc = new Scanner(System.in);
        float sellingPrice = sc.nextFloat();
        System.out.println("Enter costPrice: ");
        float costPrice = sc.nextFloat();

        float profit = sellingPrice - costPrice;
        float loss = costPrice - sellingPrice;

        if(sellingPrice > costPrice){
            System.out.println("Profit of " + profit);
        }
        else if(sellingPrice < costPrice){
            System.out.println("Loss of " + loss);
        }
        else {
            System.out.println("No profit no loss");
        }
    }
    
}
