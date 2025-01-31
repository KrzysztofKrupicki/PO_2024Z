package retail;

import java.util.ArrayList;

public class TestReceipt {
    public static void main(String[] args) {
        ArrayList<Double> amounts = new ArrayList<>();
        amounts.add(3.14);
        amounts.add(2.81);
        Receipt receipt = new Receipt("R_001", amounts);
        Receipt clonedReceipt = receipt.clone();
        receipt.changeAmountAtFirstPosition(4.2);
        System.out.println(receipt);
        System.out.println(clonedReceipt);
    }
}
