import java.util.Scanner;

public class Conditionals_ex {
    public static void main(String[] args) {
        System.out.println("***********************Conditionals Statements*********************************");
        System.out.println("---If else---");
        int age;
        System.out.println("Enter your Age: " );
        Scanner sc=new Scanner(System.in);
        age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You can Drive");
        }
        else {
            System.out.println("No you cant't drive");
        }

        System.out.println("---Else if---");
        int age2;
        System.out.println("Enter your Age: " );
        Scanner sc1=new Scanner(System.in);
        age2 = sc1.nextInt();
        if(age2>28)
        {
            System.out.println("You can vote and stand for election");
        } else if (age2==18) {
            System.out.println("You can only vote");
        }
        else {
            System.out.println("Not eligible to vote");
        }
    }
}
