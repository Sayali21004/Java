import java.util.Scanner;
public class calculatecgpa {
    public static void main(String[] args) {
        System.out.println("Calculation of CGPA");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first subject marks: ");
        int sub1=sc.nextInt();
        System.out.println("Enter the second subject marks: ");
        int sub2=sc.nextInt();
        System.out.println("Enter the second subject marks: ");
        int sub3=sc.nextInt();
        int total_marks=300;
        int total_sub =3;
        System.out.println("Total marks: " +total_marks);
        int obtained_marks = sub1+sub2+sub3;
        System.out.println("Obtained Marks are: " +obtained_marks);
        float gp1=sub1/10;
        System.out.println("Grade point of subj1: " +gp1);
        float gp2=sub2/10;
        System.out.println("Grade point of subj2: " +gp2);
        float gp3=sub3/10;
        System.out.println("Grade point of subj3: " +gp3);
        float total_gp= gp1+gp2+gp3;
        System.out.println("Total Grade point is: " +total_gp);
        float CGPA= total_gp/total_sub;
        System.out.println("CGPA is: " +CGPA);
    }
}
