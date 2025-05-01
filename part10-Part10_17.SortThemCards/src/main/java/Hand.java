import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Hand implements Comparable<Hand>{

    private List<Card> cards;

    public Hand(){
        cards = new ArrayList<>();
    }

    // adds a card to the hand
    public void add(Card card){
        cards.add(card);
    } 
    
    public void sort(){
        Collections.sort(cards);
    }

    public void sortBySuit(){
        BySuitInValueOrder BySuitInValueSorter = new BySuitInValueOrder();
        Collections.sort(cards, BySuitInValueSorter);
    }

    public int compareTo(Hand hand){
        int sumHand1 = this.cards.stream().map(c -> c.getValue()).reduce(0, (base, next) -> base + next);
        int sumHand2 = hand.cards.stream().map(c -> c.getValue()).reduce(0, (base, next) -> base + next);
        return sumHand1 - sumHand2;
    }

    // prints the cards in hand as shown in the example below
    public void print(){
        for (Card card : cards){
            System.out.println(card);
        }
    } 
}
