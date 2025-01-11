public class Arrays {
    public static void main(String[] args) {
        System.out.println("*********************************Arrays**********************************************");


        //ways to create array in java
        // 1.Declaration and memory allocation
            int[] marks= new int[5];

         //2. Declaration and then memory allocation
        int[] marks1;
        marks1= new int[5];      //array syntax with memory allocation
        marks[0]=100;                 //array initialize
        marks[1]=200;
        marks[2]=300;
        marks[3]=400;
        marks[4]=500;
        System.out.println(marks[4]);

        // 3. Declaration memory allocation and initialization together
       int[] marks2 ={100,200,300,400,500};

    }
}
