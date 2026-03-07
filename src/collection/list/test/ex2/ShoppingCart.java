package collection.list.test.ex2;

import java.util.ArrayList;

public class ShoppingCart {
    private Item item;
    ArrayList<Item> items = new ArrayList<>();

    public void addItem(Item item){
        items.add(item);
    }

    public void displayItems(){
        int sumTotalPrice = 0;

        System.out.println("장바구니 상품 출력");
        for (Item value : items) {
            System.out.println("상품명: " + value.getName() + ", 합계: " + value.getTotalPrice());
            sumTotalPrice += value.getTotalPrice();
        }
        System.out.println("전체 가격 합: " + sumTotalPrice);
    }
}
