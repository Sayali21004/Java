import java.util.Scanner;
public class String_example {
    public static void main(String[] args) {
        System.out.println("Strings Function");
        String name = new String("Sayali"); // string is a class in java not a variable
        String name1 = "Here"; // second way to declare string
        System.out.print(name);
        System.out.println(name1);
        Scanner sc =new Scanner(System.in);
        String st = sc.next(); // user input of string of single word
        System.out.println(st);
        String st1 = sc.next();// user input of string of sentence
        System.out.println(st1);

    }
}
