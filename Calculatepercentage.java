import java.util.Scanner;

public class Calculatepercentage {
    public static void main(String[] args) {
        System.out.println("Calculation of Percentage of CBSE Student");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Marks of Math out of 100: ");
        int Math = sc.nextInt();

        System.out.println("Enter the Marks of Hindi out of 100: " );
        int Hindi = sc.nextInt();

        System.out.println("Enter the Marks of Science out of 100: " );
        int Science = sc.nextInt();

        System.out.println("Enter the Marks of Social_Studies out of 100: ");
        int Social_Studies = sc.nextInt();

        System.out.println("Enter the Marks of English out of 100: ");
        int English = sc.nextInt();

        int sum = Math + Hindi + Science + Social_Studies + English ;
        System.out.println(sum);
        int total_marks = 100*5;
        System.out.println(total_marks);
        int percentage = (sum*100)/total_marks;
        System.out.println("Percentage of the student is: " + percentage + "%");
    }
}
