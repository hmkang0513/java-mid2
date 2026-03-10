package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Product product;
    private int quantity;
    Map<Product, Integer> cart = new HashMap<>();


    public void add(Product product, int quantity){
        Integer existingQuantity = cart.getOrDefault(product, 0);
        cart.put(product, existingQuantity + quantity);
//        if(cart.containsKey(product)){
//            Integer i = cart.get(product);
//            int newI = i + quantity;
//            cart.put(product, newI);
//        } else {
//            cart.put(product, quantity);
//        }
    }
    public void minus(Product product, int quantity){
//        if(cart.containsKey(product)){
//            Integer i = cart.get(product);
//            int newI = i - quantity;
//            if(newI <= 0){
//                cart.remove(product);
//            }
//            cart.put(product, newI);
        int existingQuantity = cart.getOrDefault(product, 0);
        int newQuantity = existingQuantity - quantity;
        if(newQuantity <= 0){
            cart.remove(product);
        } else {
            cart.put(product, newQuantity);
        }

    }
    public void printAll(){
        System.out.println("==모든 상품 출력==");
//        for (Product product : cart.keySet()) {
//            System.out.println("상품: " + product + " 수량: " + cart.get(product));
            for (Map.Entry<Product, Integer> entry : cart.entrySet()) {
                System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
        }
    }
}
