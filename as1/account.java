public class account {
    private int id=0;
    private double balance=0;
    private double annualInterestRate=0;



    public account(int id , double balance , double rate)

    public account(int id , double balance , double rate)
    this,id = id;
    this.balance = balance;
    rate = annualInterestRate;

    public int getid()
    {
        return this.id;
    }
    public double getbalance()
    {
        return this.balance;
    }
    public double getrate()
    {
        return this.annualInterestRate;
    }
    public void setId=(int id)
    {
        this.id=id;
    }
    public void setBalance(double balance)
    {
        this.balance=balance
    }
    public void setAnnualInterestRate(double annualInterestRate)
    {
        this.annualInterestRate= annualInterestRate;
    }
    public double MonthlyAnnualInterstRate(){
        return (annualInterestRate / 12);
    }
    public double MonthlyAnnualInterest(){
        return (balance + MonthlyAnnualInterstRate)
    }
     public void withdraw(int x) {
         balance = balance - x;
     }
    public void deposite (int x) {
        balance = balance + x;
    }
}
