import java.util.Scanner;

public class string_methods {

    public static void main(String[] args) {
        System.out.println("Methods of String");
        Scanner sc = new Scanner(System.in);
        String name = "Sayali";
        System.out.println(name);

        int length = name.length();// give the length of string
        System.out.println(length);

        String Lower_case = name.toLowerCase();//convert whole string in lower case
        System.out.println(Lower_case);

        String Upper_case = name.toUpperCase();//convert whole string in upper case
        System.out.println(Upper_case);

        String name2 = "   Sayali    ";
        System.out.println(name2);
        String trim_str = name2.trim();
        System.out.println(trim_str);

        String sub_string = name.substring(4); // give the letter from mention index
        System.out.println(sub_string); // index start from 0

        String sub_string1 = name.substring(2,5); // give the letters from mention starting index and ending index
        System.out.println(sub_string1);

        String replace_str = name.replace('a','k'); // will replace a(old char) with k(new char)
        System.out.println(replace_str);
        String replace_str1 = name.replace("ali","sky");// for  more than for char
        System.out.println(replace_str1);

        System.out.println(name.startsWith("Sa"));// return true if condition satisfied else false

        System.out.println(name.endsWith("li"));// return true if condition satisfied else false

        System.out.println(name.charAt(4)); // return the char at index mention

        System.out.println(name.indexOf("y"));// return int value of index

        System.out.println(name.lastIndexOf("a",2));

        System.out.println(name.equals("Sayali"));// return true is condition satisfied else false

    }
}
