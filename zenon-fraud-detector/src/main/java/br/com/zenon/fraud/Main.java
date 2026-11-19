package br.com.zenon.fraud;

import java.io.IOException;
import java.util.List;

public class Main {
    static void main() throws IOException {

        List<Transaction> transactions;
        TransactionIngestor transactionIngestor = new TransactionIngestor();
        String pathZenon = "zenon-fraud-detector/data/zenon.csv";
        String pathPaysim = "zenon-fraud-detector/data/paysim_with_bad_data.csv";
        transactions = transactionIngestor.leitorDeCsv(pathPaysim);

        for (int i = 0; i < 10; i++) {
            System.out.println(transactions.get(i));
        }

    }
}
