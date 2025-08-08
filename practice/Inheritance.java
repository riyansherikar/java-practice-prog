
class AdvCalc{
    int mult(int n1,int n2){
        return n1*n2;
    }

    int div(int n1,int n2){
        return n1/n2;
    }
}


class Calc extends AdvCalc{
    int add(int n1,int n2){
        return n1+n2;
    }
    int sub(int n1,int n2){
        return n1 - n2;
    }
}
public class Inheritance   {
    public static void main(String[] args) {
        Calc obj = new Calc();
        int r1 = obj.add(2, 4);
        int r2 = obj.sub(5, 2);
        int r3 = obj.mult(2,6);
        int r4 = obj.div(6,2);
        System.out.println(r1 + " " +r2 +" "+r3+" "+r4);

    }
}
