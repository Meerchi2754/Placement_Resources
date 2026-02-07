import java.util.*;

public class Balance {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int initialBalance = Integer.parseInt(sc.nextLine());
        int n = Integer.parseInt(sc.nextLine());

        int currentBalance = initialBalance;
        int committedBalance = initialBalance;

        List<Transaction> transactionLog = new ArrayList<>();
        List<Integer> commitPoints = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().split(" ");
            String command = parts[0];

            switch (command) {
                case "read":
                    System.out.println(currentBalance);
                    break;

                case "credit":
                    int creditAmount = Integer.parseInt(parts[1]);
                    transactionLog.add(new Transaction("credit", creditAmount));
                    currentBalance += creditAmount;
                    break;

                case "debit":
                    int debitAmount = Integer.parseInt(parts[1]);
                    transactionLog.add(new Transaction("debit", debitAmount));
                    currentBalance -= debitAmount;
                    break;

                case "abort":
                    int abortIndex = Integer.parseInt(parts[1]) - 1;
                    if (abortIndex < transactionLog.size()) {
                        Transaction t = transactionLog.get(abortIndex);
                        if (!t.aborted) {
                            if (t.type.equals("credit"))
                                currentBalance -= t.amount;
                            else if (t.type.equals("debit"))
                                currentBalance += t.amount;
                            t.aborted = true;
                        }
                    }
                    break;

                case "commit":
                    committedBalance = currentBalance;
                    commitPoints.add(committedBalance);
                    transactionLog.clear();
                    break;

                case "rollback":
                    int rollbackIndex = Integer.parseInt(parts[1]) - 1;
                    if (rollbackIndex < commitPoints.size()) {
                        currentBalance = commitPoints.get(rollbackIndex);
                        transactionLog.clear();
                    }
                    break;
            }
        }
        sc.close();
    }

    static class Transaction {
        String type;
        int amount;
        boolean aborted;

        Transaction(String type, int amount) {
            this.type = type;
            this.amount = amount;
            this.aborted = false;
        }
    }
}