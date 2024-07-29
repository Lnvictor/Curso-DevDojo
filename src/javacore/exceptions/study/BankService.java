package javacore.exceptions.study;

import java.io.Closeable;
import java.util.Calendar;

public class BankService implements Closeable, IService {
    @Override
    public void close() {
        System.out.println("Opa to fechando aqui porque deu ruim ou poruqe finalizou tudo");
    }

    @Override
    public String makePayment(String receiver, String buyer) {
        if (!receiver.equals("receiver")) {
            throw new InvalidReceiverException("Receiver must be receiver");
        }

        return "new balance is equals to $$$$";
    }
}
