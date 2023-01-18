package Lab_cycle;

import java.util.Arrays;

class good_morning{
    public String toString(){
        return "Good Morning!";
    }
}
public class Lab_Cycle6b {
    public static void main(String[] args) {
        // i
        char arr[] = {'a','b','c','d','e'};
        String str = new String(arr);
        System.out.println(str);

        // ii
        str = "Hello world" ;
        String str2 ="bms college" ;
        str = str+' '+str2 ;
        System.out.println(str);

        // iii
        good_morning gm = new good_morning();
        System.out.println(gm.toString());

        // iv
        StringBuffer ob = new StringBuffer("Hello");
        ob.setCharAt(2,'i');
        System.out.println(ob);

        // v
        str = "This is a Java programme";
        char arr1[] = str.toCharArray();
        System.out.println(Arrays.toString(arr1));

        // vi
        String ss1="hello world";
        String ss2="hello world";
        if(ss1.compareTo(ss2)==0)
        {
            System.out.println("strings are equal");
        }
        else if(ss1.compareTo(ss2)>0)
        {
            System.out.println("string 1 is larger");
        }
        else System.out.println("string 2 is larger");

        // viii
        str = "Good morning";
        System.out.println(str.substring(0, 4));

        //ix
        str = "Good morning";
        System.out.println(str.replace("Good", "Happy"));

        // x
        str = "Good morning one and all";
        System.out.println(str.replace(" ", ""));

    }
}
