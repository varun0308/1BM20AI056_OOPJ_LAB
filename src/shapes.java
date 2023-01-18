interface Area{
    public void area();
}

interface Volume{
    public void volume();
}

class Shape{
    String name;
    Shape(String name)
    {
        this.name = name;
    }
    String getName(){
        return name;
    }
}

class Square extends Shape implements Area{
    double side;
    Square(double side, String name)
    {
        super(name);
        this.side = side;
    }
    public void area()
    {
        System.out.println("Area of square is "+(side*side));
    }
}

class Cube extends Square implements Volume{
    Cube(double side, String name)
    {
        super(side, name);
    }
    public void volume()
    {
        System.out.println("Volume of cube is "+ (side*side*side));
    }
}

public class shapes {
    public static void main(String[] args) {
        Square sq = new Square(3, "Square");
        sq.area();
        Cube cb = new Cube(4, "Cube");
        cb.volume();
    }
}
