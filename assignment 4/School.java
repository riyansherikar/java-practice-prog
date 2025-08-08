
class Teacher{
    String name,subject;

    Teacher(String name,String subject){
        this.name = name;
        this.subject = subject;
    }

    void info(){
        System.out.println("Teacher name"+name);
        System.out.println("Teacher Subject"+subject);
    }
}

class Students extends Teacher{
    int rollno;

    Students(String name,String subject,int rollno){
        super(name, subject);
        this.rollno = rollno;
    }

    @Override
    void info(){
        super.info();
        System.out.println("Roll no"+rollno);
    }
}

public class School {
    public static void main(String[] args) {
        Students s1 = new Students("snsak", "maths", 2200);
        s1.info();
    }
}
