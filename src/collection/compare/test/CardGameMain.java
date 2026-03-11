package collection.compare.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardGameMain {
    public static void main(String[] args) {
        List<Integer> cardNum = new ArrayList<>();
        List<Character> cardTrump = new ArrayList<>();
        for (int i = 1; i < 14; i++) {
            cardNum.add(i);
        }
        cardTrump.add('♠');
        cardTrump.add('♥');
        cardTrump.add('◆');
        cardTrump.add('♣');
        List<String> deck = new ArrayList<>();
        for (int i = 0; i < cardTrump.size(); i++) {
            for (int j = 0; j < cardNum.size(); j++) {
                deck.add(cardNum.get(j) + "(" + cardTrump.get(i) + ")");
            }
        }
        System.out.println(deck);
        Collections.shuffle(deck);
        System.out.println(deck);

        ArrayList<String> player1 = new ArrayList<>();
        int player1Result = 0;
        ArrayList<String> player2 = new ArrayList<>();
        int player2Result = 0;

        for (int i = 0; i < 5; i++) {
            player1.add(deck.get(i));
        }
        player1.sort(null);
        System.out.println("player1 = " + player1);
        for (int i = 5; i < 10; i++) {
            player2.add(deck.get(i));
        }
        player2.sort(null);
        System.out.println("player2 = " + player2);
    }
}
