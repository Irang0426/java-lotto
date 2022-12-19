package lotto;

import camp.nextstep.edu.missionutils.Console;

import java.util.ArrayList;
import java.util.List;

public class WinningLotto {
    private Rank rank;
    private List<Integer> winningNumber;
    private int bonusNumber;

    public WinningLotto() {
        winningNumber = new ArrayList<>();
        bonusNumber = 0;
    }

    public void inputWinningNumber() {
        String[] str = Console.readLine().split(",");
        for (int i = 0; i < str.length; i++) {
            winningNumber.add(Integer.parseInt(str[i]));
        }
    }

    public void inputBonusNumber() {
        bonusNumber = Integer.parseInt(Console.readLine());
    }
}
