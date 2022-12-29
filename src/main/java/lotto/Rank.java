package lotto;

public enum Rank {
    FIRST(6, false, 2000000000),
    SECOND(5, true, 30000000),
    THIRD(5, false, 1500000),
    FOURTH(4, false, 50000),
    FIFTH(3, false, 5000)
    ;

    private int count;
    private int winningMoney;
    private boolean bonus;

    Rank(int count, boolean bonus, int winningMoney) {
        this.count = count;
        this.bonus = bonus;
        this.winningMoney = winningMoney;
    }

}
