public class Method_overloading {

    static void change(int a)
    {
        a=98;
    }

    static void change2(int [] arr)
    {
        arr[0]=98;
    }

    public static void main(String[] args) {
        System.out.println("************Method Overloading***************");
        int[] marks={76,89,54,45,67};
        int x = 45;
        System.out.println("Original object is passed so it can't chnage");
        System.out.println("Value of x before calling change is: " +x);
        change(x);
        System.out.println("The value of x after running change is: " +x );
        System.out.println(" ");
        System.out.println("Array is change coz it's reference is passed so");
        System.out.println("Value of x before calling change is: " +marks[0]);
        change2(marks);
        System.out.println("The value of x after running change is: " +marks[0] );

    }
}
