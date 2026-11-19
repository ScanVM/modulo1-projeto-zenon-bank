package br.com.zenon.fraud;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class TransactionIngestor {

     List<Transaction> leitorDeCsv(String path) throws IOException{
        List<Transaction> transactions = new ArrayList<>();

        try(BufferedReader leitor = Files.newBufferedReader(Path.of(path))){
            leitor.readLine();

            String linha;
            int counter = 0;

            while(counter < 1000){
                if ((linha = leitor.readLine()) != null){
                    String[] campos = linha.split(",");
                    Transaction transaction = new Transaction(
                        counter,
                        Integer.parseInt(campos[0]),
                        TransactionType.valueOf(campos[1]),
                        Double.parseDouble(campos[2]),
                        campos[3],
                        Double.parseDouble(campos[4]),
                        Double.parseDouble(campos[5]),
                        campos[6],
                        Double.parseDouble(campos[7]),
                        Double.parseDouble(campos[8]),
                        Integer.parseInt(campos[9]),
                        Integer.parseInt(campos[10])
                    );
                    transactions.add(transaction);
                    counter++;
                }else {
                    System.out.println("Campo não encontrado.");
                    break;
                }
            }
        }
        return transactions;
    }
}
