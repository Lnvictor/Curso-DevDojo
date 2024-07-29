package javacore.exceptions.study;

public class Test {
    public static void main(String[] args) {
        try (BankService service = new BankService()) {
            service.makePayment("receiver", "buyer");
        } catch (NegativeBalanceException | InvalidReceiverException e) {
            e.printStackTrace();
        }
    }
}
