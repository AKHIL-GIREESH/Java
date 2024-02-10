abstract class Shape{
    abstract void numOfSides();
}

class Triangle extends Shape{
    void numOfSides(){
        System.out.println("3");
    }
}

class Rectangle extends Shape{
    void numOfSides(){
        System.out.println("4");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        Triangle t = new Triangle();
        t.numOfSides();

        Rectangle r = new Rectangle();
        r.numOfSides();
    }
}
