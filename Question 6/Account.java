class Account1{
    public int acNo;
    public double balance;
    public Account1(int acNo , double balance)
    {
        this.acNo = acNo;
        this.balance = balance;
    }
    public int getAcNo()
    {
        return acNo;
    }
    public double getBalance()
    {
        return balance;
    }
     public String toString() {
        return "Account Number: " + acNo + "\nBalance: " + balance;
    }
    
}   

class Saving extends Account1{
    private double interestRate;
    
    public Saving(int acNo , double balance , double interestRate){
     super(acNo, balance);
        this.interestRate = interestRate;   
    }
    public void checkBalance()
    {
        System.out.println(this.balance);
    }
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Amount Inserted");
       System.out.println("Available Balance for now is : " + this.balance);
    }
    public void withdraw(double amount)
    {
        if(this.balance < 0)
        {
            System.out.println("Insufficient Balance");
        }
        else{

            this.balance -= amount;
            System.out.println("Amount withdrwed");
              System.out.println("Available Balance for now is : " + this.balance);
        }
    }
    public void interestRate()
    {
        double interest  = (interestRate * this.balance)/100;
        this.balance += interest;
        System.out.println("Your interest on your savings is : " + interest);
        System.out.println("After apllying interest rate your final balance is " + this.balance);

    }
     public String toString() {
        return "Account Number: " + acNo + "\nBalance: " + balance + "\nInterest Rate" + interestRate;
    }

    }
    
    class Current extends Account1{

        private double overdraftLimit;
         private double interestRate;
    
    public Current(int acNo , double balance , double interestRate , double d){
     super(acNo, balance);
     this.interestRate = interestRate;
        this.overdraftLimit = d;   
    }
        public void checkBalance()
    {
        System.out.println(this.balance);
    }
   
    public void deposit(double amount)
    {
        this.balance += amount;
        System.out.println("Amount Inserted");
       System.out.println("Available Balance for now is : " + this.balance);
    }
    public void withdraw(double amount)
    {
        if(this.balance < 0)
        {
            System.out.println("Insufficient Balance");
        }
         else if (balance + overdraftLimit < amount) {
            System.out.println("Exceeding overdraft limit. Withdrawal failed.");
        }
        else{

            this.balance -= amount;
            System.out.println("Amount withdrwed");
              System.out.println("Available Balance for now is : " + this.balance);
        }
    }
     public void interestRate()
    {
        double interest  = (interestRate * this.balance)/100;
        this.balance += interest;
        System.out.println("Your interest on your savings is : " + interest);
        System.out.println("After apllying interest rate your final balance is " + this.balance);

    }
     public String toString() {
        return "Account Number: " + acNo + "\nBalance: " + balance + "\noverdraft Limit" + overdraftLimit;
    }
}
public class Account  {
    public static void main(String[] args) {
        try{
        Saving s1  = new Saving(1212121212, 50000.00 ,5.0 );
        s1.checkBalance();
        s1.deposit(5000.00);
        s1.withdraw(5000.00);
        s1.interestRate();
        s1.toString();


        Current c1   = new Current(1212121213, 55000.00 ,2.0  ,10000.0);
        c1.checkBalance();
        c1.deposit(5000.00);
        c1.withdraw(5000.00);
        c1.interestRate();
        c1.toString();
    }
    catch(Exception e)
    {
        System.out.println("An error occured");
    }
}
    }
