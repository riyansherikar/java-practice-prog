public class Shape {
    
    void area(int side){
        System.out.println("Area of Square"+(side*side));
    }

    void area(int lenth, int width){
        System.out.println("Area of Rectangle"+(lenth*width));
    }

    public static void main(String[] args) {
        Shape s = new Shape();

        s.area(20);
        s.area(30, 50);
    }
}
