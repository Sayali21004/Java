
import java.util.Scanner;
public class integerornot {
    public static void main(String[] args) {
        System.out.println("Check whether the value enter is Integer or not");
        Scanner sc=new Scanner(System.in);
        boolean b1 = sc.hasNextInt();
        System.out.println(b1);
    }
}
