package br.com.zenon.fraud;

public record Transaction(int step, TransactionType type, double amount, String nameOrig, double oldbalanceOrg,double newbalanceOrig,String nameDest,double oldbalanceDest,double newbalanceDest, int isFraud, int isFlaggedFraud) {


//    @Override
//    public String toString() {
//        return "Transaction" +
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
