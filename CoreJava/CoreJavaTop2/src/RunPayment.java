public class RunPayment {
    public static void main(String args[]){
        CashPayment cash1 = new CashPayment(234);
        CashPayment cash2 = new CashPayment(35);
        CreditCardPayment cred1 = new CreditCardPayment(5345, "Joe Wild", "04/28", 3356724689632567L);
        CreditCardPayment cred2 = new CreditCardPayment(235, "Carol Baskin", "07/22", 2393019283940598L);

        cash1.paymentDetails();
        cash2.paymentDetails();
        cred1.paymentDetails();
        cred2.paymentDetails();
    }
}

class Payment{
    double amount;

    Payment(double input){
        amount = input;
    }

    public double getAmount(){
        return amount;
    }

    public void setAmount(double input){
        amount = input;
    }

    public void paymentDetails(){
        System.out.println("The payment amount was $" + amount);
    }
}

class CashPayment extends Payment{

    CashPayment(double input){
        super(input);
    }

    public void paymentDetails(){
        System.out.println("This was a cash payment of the amount $" + amount);
    }
}

class CreditCardPayment extends Payment{
    String name, expiration_date;
    long card_number;

    CreditCardPayment(double input, String nm, String exp_d, long crd_num){
        super(input);
        name = nm;
        expiration_date = exp_d;
        card_number = crd_num;
    }

    public void paymentDetails(){
        System.out.println("This was a credit card payment of $" + amount);
        System.out.println("Name on card: " + name);
        System.out.println("Expiration date: " + expiration_date);
        System.out.println("Card number: " + card_number);
    }
}
