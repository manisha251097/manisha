import java.util.*;
import java.util.List;
import java.util.Collections;

//selecting the card
class SelectionCard {
    public Cards[] Selection(Cards[] cards) {
        int n = cards.length;
        for (int i = 0; i < n; i++) {
            int minimum = i;
            for (int j = i + 1; j < n; j++) {
                if (cards[j].compareTo(cards[minimum]) < 0) {
                    minimum = j;
                }
            }
            Cards temp = cards[i];
            cards[i] = cards[minimum];
            cards[minimum] = temp;

        }
        return cards;
    }

    // main method
    // the value and type of the card are iterated
    public static void main(String[] args) {
        int[] value = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13 };
        int[] type = { 1, 2, 3, 4 };
        Cards[] card = new Cards[52];
        int n = 0;
        for (int i = 0; i < value.length; i++) {
            for (int j = 0; j < type.length; j++) {
                card[n++] = new Cards(value[i], type[j]);

            }
        }
        SelectionCard s = new SelectionCard();
        List<Cards> cardlist = Arrays.asList(card);
        System.out.println(Arrays.toString(card));
        Collections.shuffle(cardlist);
        cardlist.toArray(card);
        System.out.println(Arrays.toString(s.Selection(card)));
    }
}
