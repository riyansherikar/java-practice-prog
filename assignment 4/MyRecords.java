class Student{
    String name;
    int rollnumber;
    double marks;

    public Student(String name, int rollmunber,double marks){
        this.name = name;
        this.rollnumber = rollmunber;
        this.marks = marks;
    }
}

public class MyRecords extends Student{
    public MyRecords(String name, int rollmunber,double marks){
        super(name, rollmunber, marks);
    }

    public double getPercentage(){
        return marks;
    }

    public void display(){
        System.out.println("name"+name);
        System.out.println("rollnumber"+rollnumber);
        System.out.println("marks"+getPercentage());
    }

    public static void main(String[] args) {
        MyRecords student1 = new MyRecords("leo", 222, 70);
        student1.display();
    }
}
