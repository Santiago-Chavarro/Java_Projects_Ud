public class SavingsAccount {
    public String owner;
    public int balanceDollar;
    public double balanceEuro;

    public SavingsAccount(String owner, int balanceDollar){
        this.owner = owner;
        this.balanceDollar = balanceDollar;
        balanceEuro = balanceDollar * 0.85;
    }

    public void addMoney(int balanceDollar){
        System.out.println("Adding " + balanceDollar + " dollars in the acount");
        this.balanceDollar += balanceDollar;
        System.out.println("His new balance is " + this.balanceDollar + " dollars");
    }

    public static void main(String[] args) throws Exception {
        SavingsAccount NataAccount = new SavingsAccount("Natalia", 200);
        NataAccount.addMoney(20);
    }
}
