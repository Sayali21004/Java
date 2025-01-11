import java.sql.SQLOutput;

public class Methods_ex {

    static int add(int x, int y)        //static keyword means it does not need to create object it is called itself
    {
        int res = x+y;
        return res;

    }

    public void add1(int z,int p)       //this is non-static function in which it is called with the help of object of class.
    {
        int res1 = z+p;
        System.out.println(res1);
    }

    public static void main(String[] args) {
        System.out.println("_______Here is the example of Static Methods!_________");
        Methods_ex m = new Methods_ex();
        int a=5;
        int b=10;
        int c;
        c = add(a,b);
        System.out.println(c);
        System.out.println("________Here is the example of Non-Static Methods________");
        m.add1(a,b);
    }
}
