
import java.util.Scanner;


class ZeroNumberException extends Exception{
    public ZeroNumberException(String message){
        super(message);
    }
}

public class NumberProcessing{
    public static int sumFirstLastDigit(int number){
        int lastdigit = number/10;
        int firstdigit = number;

        while(firstdigit >= 10){
            firstdigit = lastdigit/10;
        }
        return firstdigit + lastdigit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number");
        int number = sc.nextInt();

        try{
            if(number == 0){
                throw new ZeroNumberException("number is zero");
            }
            int sum = sumFirstLastDigit(number);

            System.out.println("sum of first and last digit is"+sum);
        }catch(ZeroNumberException e){
            System.out.println("Exception "+e.getMessage());
        }

        sc.close();
    }
}