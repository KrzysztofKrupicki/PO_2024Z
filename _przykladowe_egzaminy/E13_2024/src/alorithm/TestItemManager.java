package alorithm;

public class TestItemManager {
    public static void main(String[] args) {
        ItemManager<Integer> integerItemManager = new ItemManager<>();
        integerItemManager.addItem(5);
        integerItemManager.addItem(6);
        integerItemManager.addItem(2);
        integerItemManager.addItem(2);
        integerItemManager.addItem(5);
        integerItemManager.addItem(5);
        System.out.println(integerItemManager.getItem(4));
        System.out.println(integerItemManager.getItemCount());
    }
}
