class Shape{
    int len,bre,dep;
    Shape(){
        len = 10;
        bre = 10;
        dep = 10;
    }

    int Area(){
        return len*bre;
    }

    int Volume(){
        return Area()*dep;
    }
}

public class Func2Func {
    public static void main(String a[]) {
        Shape s1 = new Shape();
        System.out.println("Volume is : "+ s1.Volume());
    }    
}