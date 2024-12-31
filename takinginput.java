import java.util.Scanner;
public class takinginput {
    public static void main(String[] args) {
        System.out.println("Taking the input from user: ");
        Scanner sc =new Scanner(System.in);
       // System.out.println("Enter number 1: ");
      //  int a=sc.nextInt();
        //float c = sc.nextFloat();
       // System.out.println("Enter number 2: ");
       // int b=sc.nextInt();
        //float d = sc.nextFloat();
        //float sum=c+d;
       // System.out.println("The sum of two numbers are : " +sum);
       // boolean b1 = sc.hasNextInt();
        //System.out.println(b1);
       // String str =sc.next(); // for single word
        String str = sc.nextLine();// for sentence
        System.out.println(str);
    }
}
