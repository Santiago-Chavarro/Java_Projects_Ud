public class SavingsAccount {

    int balance;

    public SavingsAccount(int initialBalance){
        balance = initialBalance;
    }

    public void chechedBalance(){
        System.out.println("Hi");
        System.out.println("Your balance is: " + balance);
    }

    public void deposit(int ammountToDeposit){
        balance = ammountToDeposit + balance; 
        System.out.println("You just deposited " + ammountToDeposit);
    }

    public int withdraw(int ammountToWithdraw){
        balance = balance - ammountToWithdraw;
        System.out.println("You just withdrew " + ammountToWithdraw);
        return ammountToWithdraw;
    }

    public String toString(){
        return "This is a savings account whit " + balance + "saved";
    }

    public static void main(String[] args) throws Exception {
        SavingsAccount savings = new SavingsAccount(1500);
        savings.chechedBalance();
        savings.withdraw(630);
        savings.chechedBalance();
        savings.deposit(1000);
        savings.chechedBalance();
        savings.deposit(1200);
        savings.chechedBalance();
        System.out.println(savings);
    }
}
