package strategy;

public enum Hand {
    ROCK("주먹", 0),
    SCISSORS("가위", 1),
    PAPER("보", 2);

    private String name;
    private int value;
    private static Hand[] hands = {
            ROCK, SCISSORS, PAPER
    };

    private Hand(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public static Hand getHand(int value) {
        return hands[value];
    }

    public boolean isStronger(Hand hand) {
        return figth(hand) == 1;
    }

    public boolean isWeaker(Hand hand) {
        return figth(hand) == -1;
    }

    private int figth(Hand hand) {
        if (this == hand) {
            return 0;
        } else if ((this.value + 1) % 3 == hand.value )  {
            return 1;
        } else {
            return -1;
        }
    }

    public String toString() {
        return this.name;
    }
}
