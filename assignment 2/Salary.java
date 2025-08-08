public class Salary {
    double basic,TD,DA,HRA;

    Salary(double basic ,double TD,double DA,double HRA){
        this.basic = basic;
        this.TD = TD;
        this.DA = DA;
        this.HRA = HRA;
    }

    double calcSalary(){
        return basic+TD+DA+HRA;
    }

    void displaySalary(){
        System.out.println("Total Salary"+calcSalary());
        
    }

    public static void main(String[] args) {
        Salary emp1 = new Salary(30000,2000,3000,5000);
        Salary emp2 = new Salary(40000,2000,3000,5000);

        System.out.println("Emplyee 1");

        emp1.displaySalary();

        System.out.println("Employee 2");

        emp2.displaySalary();
    }
}
