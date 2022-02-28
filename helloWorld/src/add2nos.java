import java.util.Scanner;

public class add2nos{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:: ");
        int no1 = sc.nextInt();
        System.out.println("Enter second number:: ");
        int no2 = sc.nextInt();
        int sum = no1+no2;
        System.out.println("The sum of the numbers is "+ sum);
        sc.close();
    }
}