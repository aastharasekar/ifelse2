import java.util.*;
class Q9{
public static void main(String[] args) {
    
    System.out.println("Enter first no a : ");
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    System.out.println("Enter Second no b: ");
    int b = sc.nextInt();
    System.out.println("Enter Third no. c: ");
    int c = sc.nextInt();

    if(a*a+b*b == c*c){
        System.out.println("Its Pythagorean Triplet");
    }
    else{
        System.out.println("Not a Pythagorean Triplet");
    }
}
} 
