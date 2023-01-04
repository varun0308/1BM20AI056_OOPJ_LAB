package exception_handling;
// Arrays index accessing error

import java.util.* ;

public class exception_handling3 {

    public static void main(String[] args) {
        int[] gayatre = new int[10];
        for(int i=0;i<10;i++)
        {
            gayatre[i] = i*i;
        }
        Scanner sc = new Scanner(System.in);
        int index = sc.nextInt();
        try
        {
            System.out.println(gayatre[index]);
        }
        catch(java.lang.ArrayIndexOutOfBoundsException e)
        {   
            System.out.println("Array index is out of bounds");
        }
        sc.close();
    }
}
