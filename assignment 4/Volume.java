
abstract class Shape{
    abstract double volume();
}

class Sphere extends Shape{
    double radius;
    Sphere(double radius){
        this.radius = radius;
    }

    @Override
    double volume(){
        return (4.0/3.0) * Math.PI * Math.pow(radius, 3);
    }
}

class Cylinderrrr extends Shape{
    double radius,height;
    Cylinderrrr(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double volume(){
        return Math.PI*Math.pow(radius, 2)*height;
    }
}
class Coneee extends Shape{
    double radius,height;
    Coneee(double radius,double height){
        this.radius = radius;
        this.height = height;
    }

    @Override
    double volume(){
        return (1.0/3.0)*Math.PI*Math.pow(radius, 2)*height;
    }
}

public class Volume {
    public static void main(String[] args) {
        Shape sphere = new Sphere(5);
        Shape Cylinderrrr = new Cylinderrrr(4,10);
        Shape Coneee = new Coneee(3, 7);

        System.out.println("Volume of sphere"+sphere.volume());
        System.out.println("Volume of Cylinder"+Cylinderrrr.volume());
        System.out.println("Volume of cone"+Coneee.volume());
    }
}
