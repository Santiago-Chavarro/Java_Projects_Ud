public class Bank{
    private CheakingAccount accountOne;
    private CheakingAccount accountTwo;
    private CheakingAccount accountThree;

    public Bank(){
        accountOne = new CheakingAccount("Zeus", 100);
        accountOne = new CheakingAccount("Zeus", 100);
        accountThree = new CheakingAccount(inputName:"Loaxert", inputBalance:2000)
    }
    public static void main(String[] args){
        Bank bankOfGods = new Bank();
        System.out.println(bankOfGods.accountOne.name);
        System.out.println(bankOfGods.accountOne.balance);
        System.out.println(bankOfGods.accountThree.name);
        System.out.println(bankOfGods.accountThree.balance);
    }

}
