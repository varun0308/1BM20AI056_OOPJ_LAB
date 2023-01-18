enum Apple {
    Jonathan, GoldenDel, RedDel, Winesap, Cortland
}
public class enums {
    public static void main(String[] args) {
        Apple d ;
        d = Apple.Cortland;
        for(Apple a: Apple.values())
        {
            System.out.println(a);    
        }
        System.out.println(Apple.valueOf("GoldenDel"));
        System.out.println(d.compareTo(Apple.RedDel));
        System.out.println(d.compareTo(Apple.Cortland));
    }
}
