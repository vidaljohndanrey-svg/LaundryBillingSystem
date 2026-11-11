
package LaunSys;

 public class TransactionHistory {

    private static Transaction[] transactions = new Transaction[100];
    private static int count = 0;

    // Add transaction
    public static boolean addTransaction(Transaction transaction) {
        if (count >= transactions.length) {
            return false;
        }

        transactions[count] = transaction;
        count++;

        return true;
    }

    // Get all transactions
    public static Transaction[] getTransactions() {
        Transaction[] result = new Transaction[count];

        for (int i = 0; i < count; i++) {
            result[i] = transactions[i];
        }

        return result;
    }

    // Linear Search by customer number
    public static Transaction searchByCustomerNo(String customerNo) {
        for (int i = 0; i < count; i++) {
            if (transactions[i].getCustomerNo()
                    .equalsIgnoreCase(customerNo)) {
                return transactions[i];
            }
        }

        return null;
    }

    // Bubble Sort by total amount
    public static void bubbleSortByAmount() {
        for (int i = 0; i < count - 1; i++) {
            for (int j = 0; j < count - 1 - i; j++) {

                if (transactions[j].getTotalAmount()
                        > transactions[j + 1].getTotalAmount()) {

                    Transaction temp = transactions[j];
                    transactions[j] = transactions[j + 1];
                    transactions[j + 1] = temp;
                }
            }
        }
    }
}
