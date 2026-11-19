package br.com.zenon.fraud;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static br.com.zenon.fraud.TransactionType.*;

public class Main {
    static void main() throws IOException {

        List<Transaction> transactions;
        TransactionIngestor transactionIngestor = new TransactionIngestor();

        transactions = transactionIngestor.leitorDeCsv("zenon-fraud-detector/data/zenon.csv");

        for (int i = 0; i < 10; i++) {
            System.out.println(transactions.get(i));
        }

    }
}
