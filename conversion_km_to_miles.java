import java.util.Scanner;
public class conversion_km_to_miles {
    public static void main(String[] args) {
        System.out.println("Conversion of KM to Miles");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Value in Kilometer to be converted into Miles");
        int a = sc.nextInt();
        double miles = a*0.621371;
        System.out.println("The result is: " +miles);
    }
}
