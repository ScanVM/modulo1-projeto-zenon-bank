package br.com.zenon.fraud;

import static br.com.zenon.fraud.TransactionType.*;

public class Main {
    static void main() {

        var transaction1 = new Transaction(1,1, PAYMENT,9839.64,"C1231006815", 170136.0,160296.36,"M1979787155",0.0,0.0,0,0);
        var transaction2 = new Transaction(2, 743, CASH_OUT, 850002.52, "C1280323807",850002.52, 0.0, "C873221189", 6510099.11, 7360101.63,1,0);

        System.out.println(transaction1.toString());
        System.out.println(transaction2.toString());


    }
}
