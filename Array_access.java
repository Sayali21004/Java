public class Array_access {
    public static void main(String[] args) {
        System.out.println("********Array Accessing*********");
         int marks[] = {100,200,300,400,500};
         int len = marks.length;
        System.out.println("Length of array: " +len);

        //1. Navie Way
        System.out.println("-----Accesing element using Navie Way-----");
        System.out.println(marks[0]);                 //array initialize
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        //2. for loop
        System.out.println("-----Accesing element using For Loop Way-----");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        //3 for each loop
        System.out.println("-----Accesing element using For Each Loop-----");
        for(int element : marks)
        {
            System.out.println(element);
        }
    }
}
