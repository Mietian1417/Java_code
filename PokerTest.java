package Collection.List接口.ArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: 陈子豪
 * Date: 2021-06-05
 * Time: 17:59
 */

//牌的基本属性
class Poker {
    private final String variety;
    private final int value;

    public Poker(String variety, int value) {
        this.variety = variety;
        this.value = value;
    }


    public int getValue() {
        return value;
    }

    public String getVariety() {
        return variety;
    }

    @Override
    public String toString() {
        return "{" +
                "variety=" + variety +
                ", value=" + value +
                '}';
    }
}

class Cards {
    public static final String[] varieties = {"♥", "♦", "♠", "♣"};

    //创建一副牌
    public List<Poker> desk() {
        List<Poker> cards = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            for (int j = 1; j <= 13; j++) {
                cards.add(new Poker(varieties[i], j));
            }
        }
        return cards;
    }

    //换牌
    public void swap(List<Poker> cards, int i, int j) {
        Poker temp = cards.get(i);
        cards.set(i, cards.get(j));
        cards.set(j, temp);
    }

    //洗牌
    public void shuffle(List<Poker> cards) {
        for (int i = cards.size() - 1; i > 0; i--) {
            Random random = new Random();
            //交换牌
            swap(cards, i, random.nextInt(i));
        }
    }

    //三人玩牌， 每次发五张（轮流发牌）
    public void play(List<Poker> cards) {
        ArrayList<Poker> hand1 = new ArrayList<>();
        ArrayList<Poker> hand2 = new ArrayList<>();
        ArrayList<Poker> hand3 = new ArrayList<>();
        ArrayList<ArrayList<Poker>> hand = new ArrayList<>();
        hand.add(hand1);
        hand.add(hand2);
        hand.add(hand3);
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                Poker poker = cards.remove(0);
                hand.get(j).add(poker);
            }
        }
    }
}

public class PokerTest {
    public static void main(String[] args) {
        Cards cards = new Cards();
        //创建一副牌
        List<Poker> desk = cards.desk();
        System.out.println(desk);
        //洗牌
        cards.shuffle(desk);
        System.out.println(desk);
        //发牌
        cards.play(desk);
        System.out.println(desk);
    }
}
