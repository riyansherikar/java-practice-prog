
class Shape{
    double radius,height;
    Shape(double radius,double height){
        this.radius= radius;
        this.height = height;
    }

    double volume(){
        return 0;
    }
}

class Cone extends Shape{
    Cone(double radius,double height){
        super(radius, height);
    }

    @Override
    double volume(){
        return (1.0/3)*Math.PI *radius*radius*height;
    }
}

class Cylinder extends Shape{

     Cylinder(double radius,double height) {
        super(radius,height);
    }
    
    @Override
    double volume(){
        return Math.PI * radius*radius*height;
    }

}

public class Main {
    public static void main(String[] args) {
        Cone cone = new Cone(5, 10);
        Cylinder cylinder = new Cylinder(4, 12);

        System.out.println("Volume of cone"+cone.volume());
        System.out.println("Volume of cylinder"+cylinder.volume());
    }
}
