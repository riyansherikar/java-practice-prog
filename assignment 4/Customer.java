

class Customer {
    String name;
    String phoneNumber;

    public Customer(String name,String phoneNumber){
        this.name = name;
        this.phoneNumber = phoneNumber;
    }
}

class Depositor extends Customer{
    int accountNum;
    double balance;
    public Depositor(String name, String phoneNumber,int accountNum,double balance) {
            super(name, phoneNumber);
            this.accountNum = accountNum;
            this.balance = balance;
        }

        public void displayDepositor(){
            System.out.println("Name"+name);
            System.out.println("Name"+phoneNumber);
            System.out.println("Name"+accountNum);
            System.out.println("Name"+balance);
        }
}

class Borrow extends Depositor{
    int loanAmt;
    public Borrow(String name, String phoneNumber,int accountNum,double balance,int loanAmt){
        super(name, phoneNumber, accountNum, balance);
        this.loanAmt = loanAmt;
    }

    public void displayBorrow(){
        System.out.println("phone number"+phoneNumber);
        System.out.println("name"+name);
        System.out.println("acc number"+accountNum);
        System.out.println("Balance"+balance);
        System.out.println("Loan Amount"+loanAmt);
    }

    public static void main(String[] args) {
        Borrow customer = new Borrow("cahrlie", "522562115", 12354, 55000, 200000);
        customer.displayBorrow();
    }
}