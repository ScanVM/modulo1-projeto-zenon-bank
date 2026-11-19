package br.com.zenon.fraud;

import java.math.BigDecimal;

public record Transaction(long id, int step, TransactionType type, double amount, String nameOrig, double oldbalanceOrg,double newbalanceOrig,String nameDest,double oldbalanceDest,double newbalanceDest, int isFraud, int isFlaggedFraud) {
//    private static int step;
//    private static TransactionType type;
//    private static BigDecimal amount;
//    private static String nameOrig;
//    private static BigDecimal oldbalanceOrg;
//    private static BigDecimal newbalanceOrig;
//    private static String nameDest;
//    private static BigDecimal oldbalanceDest;
//    private static BigDecimal newbalanceDest;
//    private static boolean isFraud;
//    private static boolean isFlaggedFraud;


//    @Override
//    public String toString() {
//        return "Transaction" + id +
//                "\nstep:" + step +
//                "\ntype:" + type +
//                "\namount:" + amount +
//                "\nnameOrig:'" + nameOrig + '\'' +
//                "\noldbalanceOrg:" + oldbalanceOrg +
//                "\nnewbalanceOrig:" + newbalanceOrig +
//                "\nnameDest:'" + nameDest + '\'' +
//                "\noldbalanceDest:" + oldbalanceDest +
//                "\nnewbalanceDest:" + newbalanceDest +
//                "\nisFraud:" + isFraud +
//                "\nisFlaggedFraud:" + isFlaggedFraud
//                + "\n";
//    }
}
