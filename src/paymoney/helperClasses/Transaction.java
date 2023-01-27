package paymoney.helperClasses;

public class Transaction {
    public void completed(int target, int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
            if (sum >= target) {
                System.out.println("Target achieved after " + (i + 1) + " transaction");
                break;
            }
        }
        if (sum < target) {
            System.out.println("Target not achieved");
        }
    }
}