
import java.util.Scanner;


class InvalidNameException extends Exception{
    public InvalidNameException(String message){
        super(message);
    }
}

public class ValidateEmpName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter employee name");
        String name = sc.nextLine();

        try{
            if(!name.matches("[A-Za-z ]+")){
                throw new InvalidNameException("name is invalid");
            }
            System.out.println("valid employee name"+name);
        }catch(InvalidNameException e){
            System.out.println("Exeption"+e.getMessage());
        }
        sc.close();
    }
}
