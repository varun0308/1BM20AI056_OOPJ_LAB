import Calculator.*;

public class hello {
    public static void main(String args[])
        {
            operations obj = new operations(5,6);
            int a = obj.sum();
            System.out.println(a);
            int b = obj.difference();
            System.out.println(b);
            int c = obj.product();
            System.out.println(c);
            double d = obj.divide();
            System.out.println(d);

            another_class obj2 = new another_class();
            obj2.hi();
        }
}
