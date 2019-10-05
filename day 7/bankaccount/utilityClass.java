class bankaccount{
   String AccNo="312245";
   double balance= 200.0;

}
class CheckingAccount extends bankaccount{
    

}
class SavingsAccount extends bankaccount{

}
class COD extends bankaccount{

} 
final class utilityClass{
    public static void main(String[] args) {
        CheckingAccount a = new CheckingAccount();
        System.out.println("hi");
        System.out.println(a.AccNo);
        System.out.println(a.balance);
        SavingsAccount b = new SavingsAccount();
        System.out.println("hii");
        System.out.println(b.AccNo);
        System.out.println(b.balance);
        COD c = new COD();
        System.out.println("hiii");
        System.out.println(c.AccNo);
        System.out.println(c.balance);

    }
}

        




        


