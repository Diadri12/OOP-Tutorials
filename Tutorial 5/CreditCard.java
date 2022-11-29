public class CreditCard extends Card{
    public static void main(String[] args){
        int pinNumber;
        int number;
    }

    public CreditCard(String n, int pinNumber, int number){
        super(n);
        pinNumber = pinNumber;
        number = number;

    }

    @Override
    public boolean isExpired() {
        return false;
    }
}
