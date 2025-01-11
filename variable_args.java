public class variable_args {

    static int sum(int ...arr) //available as int[] arr
    {
        int res =0;
        for(int a: arr)
        {
            res +=a;
        }
        return res ;
    }

    public static void main(String[] args) {
        System.out.println("*************Variable Arguments*********");
        System.out.println("The sum of 4 and 5 is " +sum( 4, 5));
        System.out.println("The sum of 4, 3 and 5 is: " +sum(4 ,3, 5));
        System.out.println("The sum of 1, 2,3,4,5,6,7,8,9,10: " +sum(1,2,3,4,5,6,7,8,9,10));
    }
}
